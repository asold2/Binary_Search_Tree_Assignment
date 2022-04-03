public class BinarySearchTreeNode<E extends Comparable<E>> extends BinaryTreeNode<E> implements Comparable<E>{
    public BinarySearchTreeNode(E element) {
        super(element);
    }

//    private E element;
//    private BinaryTreeNode leftChild;
//    private BinaryTreeNode rightChild;

    @Override
    public int compareTo(E o) {
        return getElement().compareTo(o);
    }


}
