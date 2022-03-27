import java.util.ArrayList;

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


    //TODO
    public boolean contains(E element){
        return false;
    }

    public ArrayList<E> inOrder(){
     return null;
    }

    public ArrayList<E> preOrder(){
        return null;
    }
    public ArrayList<E> postOrder(){
        return null;
    }
    public ArrayList<E> levelOrder(){
        return null;
    }

    public int height(){
        return 0;
    }
}
