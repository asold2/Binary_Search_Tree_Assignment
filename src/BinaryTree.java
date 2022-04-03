import java.util.*;

public class BinaryTree<E> {

    private BinaryTreeNode root;
    private int size;

    public BinaryTree(){
        this.size = 0;
    }

    public BinaryTreeNode getRoot(){
        if(root!=null){
            return root;
        }
        else{
            return null;
        }
    }

    public void setRoot(BinaryTreeNode root){
        this.root = root;
        size++;
    }

    public boolean isEmpty(){
        if(root==null && size==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

    public boolean contains(E element){

        ArrayList<E> elements = new ArrayList<>();
        elements = inOrder();
        for(int i=0; i<elements.size(); i++){
            if(elements.contains(element)){
                return true;
            }
        }
        return false;



    }

    public ArrayList<E> inOrder(){
     ArrayList<E> inOrderElements = new ArrayList<>();
     BinaryTreeNode current = root;
     Stack<BinaryTreeNode> nodes = new Stack<>();
        while(!nodes.isEmpty() || current!=null){
            if(current!=null){
                nodes.push(current);
                current = current.getLeftChild();
            }else{
                BinaryTreeNode node = nodes.pop();
                inOrderElements.add((E) node.getElement());
                current = node.getRightChild();
            }
        }
        return inOrderElements;
    }

    public ArrayList<E> preOrder(){
        ArrayList<E> preOrderElements = new ArrayList<>();
        Stack<BinaryTreeNode> nodes = new Stack<>();
        nodes.push(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode current = nodes.pop();
            preOrderElements.add((E) current.getElement());

            if(current.getRightChild()!=null){
                nodes.push(current.getRightChild());
            }
            if(current.getLeftChild() != null){
                nodes.push(current.getLeftChild());
            }
        }

        return preOrderElements;
    }
    public ArrayList<E> postOrder(){
        ArrayList<E> postOrderElements = new ArrayList<>();
        Stack<BinaryTreeNode> nodes = new Stack<>();
        nodes.push(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode current = nodes.peek();

            if(current.getLeftChild()==null && current.getRightChild()==null){
                BinaryTreeNode temp = nodes.pop();
                postOrderElements.add((E) temp.getElement());
            }else{
                if(current.getRightChild() !=null){
                    nodes.push(current.getRightChild());
                    current.addRightChild(null);
                }
                if(current.getLeftChild()!=null){
                    nodes.push(current.getLeftChild());
                    current.addLeftChild(null);
                }
            }
        }

        return postOrderElements;
        }
    public ArrayList<E> levelOrder(){
        if(root==null){
            return null;
        }
        Queue<BinaryTreeNode> nodes = new LinkedList<>();
        ArrayList<E> nodesToReturn = new ArrayList<>();

        nodes.add(root);
        while(!nodes.isEmpty()){
            BinaryTreeNode node = nodes.remove();
            nodesToReturn.add((E) node.getElement());

            if(node.getLeftChild()!=null){
                nodes.add(node.getLeftChild());
            }
            if(node.getRightChild()!=null){
                nodes.add(node.getRightChild());
            }
        }
        return nodesToReturn;
    }

    public int height(BinaryTreeNode node){
        if(root==null){
            return -1;
        }
        else{
            int leftHeight = 0;
            int rightHeight=0;

            if(node.getLeftChild()!=null){
                leftHeight = height(node.getLeftChild());
            }
            if(node.getRightChild()!=null){
                rightHeight = height(node.getRightChild());
            }

            int max = (leftHeight>rightHeight) ? leftHeight:rightHeight;
            return (max+1);

        }
    }
}
