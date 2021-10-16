import java.util.PriorityQueue;

public class BST {
    private BSTNode root;

    /**
     * constructs a new tree, initialises root to null
     */
    public BST(){
        this.root = null;
    }

    /**
     * Adds a new node containing a Profile object to the tree
     * @param p - the profile to be added
     */
    public void addProfile(Profile p){
        BSTNode newNode = new BSTNode(p);
        root = insert(root, newNode);
    }

    /**
     * Adds the new node by using recursion to place the node correctly
     * @param current the current node being compared to
     * @param newNode node to be added
     * @return
     */
    private BSTNode insert(BSTNode current, BSTNode newNode){
        if (current == null){
            return newNode;
        }
        if (newNode.getProfile().getFirstName().compareTo(current.getProfile().getFirstName()) < 0){
            current.setLeft(insert(current.getLeft(), newNode));
        }
        else if (newNode.getProfile().getFirstName().compareTo(current.getProfile().getFirstName()) > 0){
            current.setRight(insert(current.getRight(), newNode));
        }
        else {
            return current;
        }
        return current;
    }

    /**
     * Prints the tree alphabetically by using a Priority Queue
     */
    public void printAlphabeticalASC(){
        PriorityQueue<BSTNode> firstNamesSorted = new PriorityQueue<>();
        firstNamesSorted = preOrderTravQueue(root, firstNamesSorted);
        while (!firstNamesSorted.isEmpty()){
            BSTNode current = firstNamesSorted.poll();
            System.out.println(current.getProfile().getFirstName());
        }
    }

    /**
     * Uses a recursive pre-order algorithm to traverse the tree, adding each node to a priority queue
     * @param node the current node
     * @param allNodes The Priority Queue
     * @return a Priority Queue of all the nodes in the tree sorted alphabetically
     */
    private PriorityQueue<BSTNode> preOrderTravQueue(BSTNode node, PriorityQueue<BSTNode> allNodes){
        if (node != null){
            allNodes.add(node);
            preOrderTravQueue(node.getLeft(), allNodes);
            preOrderTravQueue(node.getRight(), allNodes);
        }
        return allNodes;
    }

    /**
     * initialises the starting node for findUser as the root of the binary tree and then calls the searching method
     * @param user the name to be searched for
     * @return the corresponding BSTNode for that name
     */
    public BSTNode getBSTNode(String user){
        BSTNode node = this.root;
        return findUser(node, user);
    }

    /**
     * Searches the BST recursively for a node containing a profile with a firstname corresponding to a string that has been passed in
     * by comparing the current node for equality, and then traversing either left or right
     * depending on the result of the compareTo() function
     * @param node the current node being compared to
     * @param toFind the string to compare with
     * @return the matching node
     */
    private BSTNode findUser(BSTNode node, String toFind) {
        if (node.getProfile().getFirstName().compareTo(toFind) == 0) {
            return node;
        }
        else if (node.getProfile().getFirstName().compareTo(toFind) > 0) {
            return findUser(node.getLeft(), toFind);
        } else {
            return findUser(node.getRight(), toFind);
        }
    }

    /**
     * Calls the pre-order traversal method and initialises node to the root of the BST
     */
    public void callPreOrderTrav(){
        BSTNode node = this.root;
        preOrderTrav(node);
    }

    /**
     * Recursive pre-order traversal of the BST, outputs the toString() of the profile of each node as it runs
     * @param node the current node
     */
    private void preOrderTrav(BSTNode node){
        if (node != null){
            System.out.println(node.getProfile().toString());
            preOrderTrav(node.getLeft());
            preOrderTrav(node.getRight());
        }
    }

}
