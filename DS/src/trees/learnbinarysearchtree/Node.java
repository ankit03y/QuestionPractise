package trees.learnbinarysearchtree;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private int value;

    public Node(int data){
        this.value = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        //this.value = value;
        throw new RuntimeException("Node value cannot be changed");
    }
}

