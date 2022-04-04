import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    BinarySearchTree tree;
    BinarySearchTreeNode root;

    @BeforeEach
    void setUp(){
        tree = new BinarySearchTree();
        root = new BinarySearchTreeNode(10);
        tree.setRoot(root);
    }

    @Test
    void insert() {
        assertTrue(tree.insert(3));

    }

    @Test
    void removeElement() {
        root.addLeftChild(new BinarySearchTreeNode(5));
        root.getLeftChild().addLeftChild(new BinarySearchTreeNode(2));
        root.getLeftChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(1));
        root.getLeftChild().getLeftChild().addRightChild(new BinarySearchTreeNode(3));
        root.getLeftChild().addRightChild(new BinarySearchTreeNode(7));
        root.getLeftChild().getRightChild().addLeftChild(new BinarySearchTreeNode(6));
        root.getLeftChild().getRightChild().addRightChild(new BinarySearchTreeNode(8));
        root.addRightChild(new BinarySearchTreeNode(17));
        root.getRightChild().addLeftChild(new BinarySearchTreeNode(13));
        root.getRightChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(11));
        root.getRightChild().getLeftChild().addRightChild(new BinarySearchTreeNode(15));
        root.getRightChild().addRightChild(new BinarySearchTreeNode(19));
        root.getRightChild().getRightChild().addLeftChild(new BinarySearchTreeNode(18));
        root.getRightChild().getRightChild().addRightChild(new BinarySearchTreeNode(23));

        tree.removeElement(7);
        tree.removeElement(19);
        tree.removeElement(23);
        tree.removeElement(10);
        System.out.println(tree.inOrder());
        assertTrue(tree.removeElement(7));
    }

    @Test
    void findMin() {
        root.addLeftChild(new BinarySearchTreeNode(5));
        root.getLeftChild().addLeftChild(new BinarySearchTreeNode(2));
        root.getLeftChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(1));
        root.getLeftChild().getLeftChild().addRightChild(new BinarySearchTreeNode(3));
        root.getLeftChild().addRightChild(new BinarySearchTreeNode(7));
        root.getLeftChild().getRightChild().addLeftChild(new BinarySearchTreeNode(6));
        root.getLeftChild().getRightChild().addRightChild(new BinarySearchTreeNode(8));
        root.addRightChild(new BinarySearchTreeNode(17));
        root.getRightChild().addLeftChild(new BinarySearchTreeNode(13));
        root.getRightChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(11));
        root.getRightChild().getLeftChild().addRightChild(new BinarySearchTreeNode(15));
        root.getRightChild().addRightChild(new BinarySearchTreeNode(19));
        root.getRightChild().getRightChild().addLeftChild(new BinarySearchTreeNode(18));
        root.getRightChild().getRightChild().addRightChild(new BinarySearchTreeNode(23));

        assertEquals(tree.findMin(), 1);
    }

    @Test
    void findMax() {
        root.addLeftChild(new BinarySearchTreeNode(5));
        root.getLeftChild().addLeftChild(new BinarySearchTreeNode(2));
        root.getLeftChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(1));
        root.getLeftChild().getLeftChild().addRightChild(new BinarySearchTreeNode(3));
        root.getLeftChild().addRightChild(new BinarySearchTreeNode(7));
        root.getLeftChild().getRightChild().addLeftChild(new BinarySearchTreeNode(6));
        root.getLeftChild().getRightChild().addRightChild(new BinarySearchTreeNode(8));
        root.addRightChild(new BinarySearchTreeNode(17));
        root.getRightChild().addLeftChild(new BinarySearchTreeNode(13));
        root.getRightChild().getLeftChild().addLeftChild(new BinarySearchTreeNode(11));
        root.getRightChild().getLeftChild().addRightChild(new BinarySearchTreeNode(15));
        root.getRightChild().addRightChild(new BinarySearchTreeNode(19));
        root.getRightChild().getRightChild().addLeftChild(new BinarySearchTreeNode(18));
        root.getRightChild().getRightChild().addRightChild(new BinarySearchTreeNode(23));

        assertEquals(tree.findMax(), 23);
    }

    @Test
    void rebalance() {
    }
}