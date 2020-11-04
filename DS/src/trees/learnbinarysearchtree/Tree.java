package trees.learnbinarysearchtree;


public class Tree {
    private Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        // this.root = root;
        throw new RuntimeException("Root value can not be changed");
    }

}
