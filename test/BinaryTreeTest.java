import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinaryTree tree;
    BinaryTreeNode root;

    @BeforeEach
    void setUp(){
        tree = new BinaryTree();
        root = new BinaryTreeNode(10);
        tree.setRoot(root);
    }

    @Test
    void getRoot() {
        assertTrue(tree.getRoot().equals(root));
    }

    @Test
    void setRoot() {
        BinaryTreeNode node = new BinaryTreeNode(2);
        tree.setRoot(node);
        assertEquals(tree.getRoot(), node);
    }

    @Test
    void isEmpty() {
        assertFalse(tree.isEmpty());
    }

    @Test
    void size() {
        assertEquals(tree.size(), 1);
    }

    @Test
    void contains() {
        assertTrue(tree.contains(10));
    }

    @Test
    void inOrder() {
        root.addRightChild(new BinaryTreeNode(13));
        root.addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(1));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        root.getRightChild().addRightChild(new BinaryTreeNode(15));
        root.getRightChild().addLeftChild(new BinaryTreeNode(11));
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(13);
        list.add(15);

        assertEquals(tree.inOrder(), list);
    }

    @Test
    void preOrder() {
        root.addRightChild(new BinaryTreeNode(13));
        root.addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(1));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        root.getRightChild().addRightChild(new BinaryTreeNode(15));
        root.getRightChild().addLeftChild(new BinaryTreeNode(11));
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(13);
        list.add(11);
        list.add(15);

        assertEquals(tree.preOrder(), list);


    }

    @Test
    void postOrder() {
        root.addRightChild(new BinaryTreeNode(13));
        root.addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(1));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        root.getRightChild().addRightChild(new BinaryTreeNode(15));
        root.getRightChild().addLeftChild(new BinaryTreeNode(11));
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(15);
        list.add(13);
        list.add(10);

        assertEquals(tree.postOrder(), list);


    }

    @Test
    void levelOrder() {
        root.addRightChild(new BinaryTreeNode(13));
        root.addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(1));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        root.getRightChild().addRightChild(new BinaryTreeNode(15));
        root.getRightChild().addLeftChild(new BinaryTreeNode(11));
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(4);
        list.add(13);
        list.add(1);
        list.add(5);
        list.add(11);
        list.add(15);

        assertEquals(tree.levelOrder(), list);


    }

    @Test
    void height() {

        root.addRightChild(new BinaryTreeNode(13));
        root.addLeftChild(new BinaryTreeNode(4));
        root.getLeftChild().addLeftChild(new BinaryTreeNode(1));
        root.getLeftChild().addRightChild(new BinaryTreeNode(5));
        root.getRightChild().addRightChild(new BinaryTreeNode(15));
        root.getRightChild().addLeftChild(new BinaryTreeNode(11));


        assertEquals(tree.height(root), 3);

    }
}