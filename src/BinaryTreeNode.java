public class BinaryTreeNode<E> {
    private E element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public BinaryTreeNode(E element) {
        this.element = element;
        leftChild = null;
        rightChild = null;
    }

    public void setElement(E element){
        this.element = element;
    }
    public E getElement(){
        return element;
    }
    public void addLeftChild(BinaryTreeNode leftChild){
        this.leftChild = leftChild;
    }
    public void addRightChild(BinaryTreeNode rightChild){
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild(){
        if(leftChild!=null){
            return leftChild;
        }
        else{
            return null;
        }
    }

    public BinaryTreeNode getRightChild(){
        if(rightChild!=null){
            return rightChild;
        }
        else{
            return null;
        }
    }


}
