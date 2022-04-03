import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest<E> {

    static BinaryTreeNode node;
    @BeforeAll
    static void setUp(){
        node = new BinarySearchTreeNode(null);
    }

    @Test
    void setElement() {
    node.setElement(3);
    assertEquals(node.getElement(), 3);
    }

    @Test
    void addLeftChild() {
        node.addLeftChild(new BinarySearchTreeNode(1));
        assertEquals(node.getLeftChild().getElement(), 1);
    }

    @Test
    void addRightChild() {
        node.addRightChild(new BinarySearchTreeNode(2));
        assertEquals(node.getRightChild().getElement(), 2);
    }
}