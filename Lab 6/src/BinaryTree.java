import java.util.Objects;

public class BinaryTree<T> {
    private Node<T> root; //node at the top of the tree

    /**
     * Overrides the root for the tree
     * @param root the top of the tree
     */
    public void setRoot(Node<T> root) {
        this.root = root;
    }

    /**
     * @return root of the tree
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * @return True/False for whether the tree is empty
     */
    public boolean isEmpty(){
        return root == null;
    }

    /**
     * adds node to left or right of current node (root) depending on String yes for right, String no for left
     * @param root current node
     * @param newNode node to be added to tree
     * @param yesOrNo yes for node to be added to the right, no to be added to the left
     */
    public void constructTree(Node<T> root, Node<T> newNode, String yesOrNo) {
        if (Objects.equals(yesOrNo, "yes")){
            root.setRight(newNode);
            System.out.println(root.getElement() + " --> " + yesOrNo + " --> " + root.getRight().getElement());
        }
        else if (Objects.equals(yesOrNo, "no")) {
            root.setLeft(newNode);
            System.out.println(root.getElement() + " --> " + yesOrNo + " --> " + root.getLeft().getElement());
        }
    }

    public static void main(String[] args){
        // Create new nodes
        Node<String> node1 = new Node<>("Age < 30?");
        Node<String> node2 = new Node<>("Exercise in the morning?");
        Node<String> node3 = new Node<>("Eat Junk Food?");
        Node<String> node4 = new Node<>("unfit");
        Node<String> node5 = new Node<>("fit");
        Node<String> node6 = new Node<>("unfit");
        Node<String> node7 = new Node<>("fit");

        //Instantiate new tree
        BinaryTree<String> newTree = new BinaryTree<>();

        //Add nodes to tree
        newTree.constructTree(null, node1, null);
        newTree.constructTree(node1,node2, "no");
        newTree.constructTree(node1, node3, "yes");
        newTree.constructTree(node2, node4, "no");
        newTree.constructTree(node2, node5, "yes");
        newTree.constructTree(node3, node6, "no");
        newTree.constructTree(node3, node7, "yes");
    }
}
