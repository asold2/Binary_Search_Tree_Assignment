public class main {
    public static void main(String[] args) {

        BinarySearchTree binaryTree2 = new BinarySearchTree();
        BinaryTreePrint binaryTreePrint = new BinaryTreePrint();



        binaryTree2.insert(13);
        binaryTree2.insert(10);
        binaryTree2.insert(15);
        binaryTree2.insert(7);
        binaryTree2.insert(9);
        binaryTree2.insert(1);
        binaryTree2.insert(22);



        binaryTreePrint.printTree(binaryTree2.getRoot());


    }
}
