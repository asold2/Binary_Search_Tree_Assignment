import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree{
    private BinarySearchTreeNode root;



    public boolean insert(E e) {

        if (root == null)
            root = createNewNode(e); // Create a new root
        else {
            // Locate the parent node
            BinarySearchTreeNode parent = null;
            BinarySearchTreeNode current = root;
            while (current != null) {
                if (e.compareTo((E) current.getElement()) < 0) {
                    parent = current;
                    current = (BinarySearchTreeNode) current.getLeftChild();
                }
                else if (e.compareTo((E) current.getElement()) > 0) {
                    parent = current;
                    current = (BinarySearchTreeNode) current.getRightChild();
                }
                else
                    return false; // Duplicate node not inserted
            }
            // Create the new node and attach it to the parent
            if (e.compareTo((E) parent.getElement()) < 0)
                parent.addLeftChild(createNewNode(e));
            else
                parent.addRightChild(createNewNode(e)) ;
        }
        return true; // Element inserted successfully
        }

     protected BinarySearchTreeNode<E> createNewNode(E e){
        return new BinarySearchTreeNode<>(e);
     }


    public boolean removeElement(E element) { // not really working
        BinarySearchTreeNode parent= null;
        BinarySearchTreeNode child = root;

        while(child!=null){
            if(element.compareTo((E) child.getElement())<0){
                parent = child;
                child = (BinarySearchTreeNode) child.getLeftChild();
            }
            else if(element.compareTo((E) child.getElement())>0){
                parent = child;
                child = (BinarySearchTreeNode) child.getRightChild();
            }
            else{
                child = null;
                break;
            }
        }
        if(child == null){
            return false;
        }

        if(child.getLeftChild() == null){
            if(parent==null){
                root = (BinarySearchTreeNode) child.getRightChild();
            }
            else{
                if(element.compareTo((E) parent.getElement())<0)
                    parent.addLeftChild(child.getRightChild());
                else
                    parent.addRightChild(child.getRightChild());
            }
        }
        else{
            BinarySearchTreeNode parentOfRightMost = child;
            BinarySearchTreeNode rightMost = (BinarySearchTreeNode) child.getLeftChild();

            while(rightMost.getRightChild() !=null){
                parentOfRightMost = rightMost;
                rightMost = (BinarySearchTreeNode) rightMost.getRightChild();
            }
            child.setElement(rightMost.getElement());
//            child.setElement(null);

            if(parentOfRightMost.getRightChild() == rightMost)
                parentOfRightMost.addRightChild(rightMost.getLeftChild());
            else
                parentOfRightMost.addLeftChild(rightMost.getLeftChild());
        }
        setSize(size()-1);
        return true;
    }



    public E findMin(){
        BinarySearchTreeNode temp = (BinarySearchTreeNode) this.getRoot();
        while(temp.getLeftChild()!=null){
            temp = (BinarySearchTreeNode) temp.getLeftChild();
        }
        return (E) temp.getElement();
    }

    public E findMax(){
        Queue<BinarySearchTreeNode> queue = new LinkedList<>();
        queue.add((BinarySearchTreeNode) this.getRoot());
        E max = (E) this.getRoot().getLeftChild().getElement();
        while(!queue.isEmpty()){
            BinarySearchTreeNode temp = queue.poll();
            if(temp.compareTo(max)>0){
                max = (E) temp.getElement();
            }
            if(temp.getLeftChild()!=null){
                queue.add((BinarySearchTreeNode) temp.getLeftChild());
            }
            if(temp.getRightChild()!=null){
                queue.add((BinarySearchTreeNode) temp.getRightChild());
            }
        }
        return max;
    }

    public void rebalance(){ // not sure if working
//        BinarySearchTree temp = new BinarySearchTree();
//        E arr[] = (E[]) this.inOrder().toArray();
//        E first = arr[0];
//        E last = arr[arr.length-1];
//        if(first.compareTo(last)<0){
//            int middle = ((int)first + (int)last)/2;
//            temp.insert(middle);
//            rebalance();
//            rebalance();
        }


    }





