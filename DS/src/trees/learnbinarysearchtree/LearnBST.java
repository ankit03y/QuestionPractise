package trees.learnbinarysearchtree;


public class LearnBST {
    public static void main(String[] args) {
        int data = 12;
        Node root = new Node(data);
        Node leftChild = new Node(11);
        root.setLeftChild(leftChild);
        Node rightChild = new Node(13);
        root.setRightChild(rightChild);
        // root.setValue(14);
        Tree tree = new Tree(root);
        System.out.println(tree.getRoot().getValue());

    }
}
