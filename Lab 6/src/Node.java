public class Node<T> {
    private T element; //the element being held in the node
    private Node<T> left; //element to the left of current node
    private Node<T> right; //element to the right of the current node

    /**
     * Constructor for node
     * @param element the information stored in the node
     */
    public Node(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    /**
     * overrides current element in node
     * @param element the information stored in the node
     */
    public void setElement(T element){
        this.element = element;
    }

    /**
     * Sets the node to the left of this node
     * @param left stores the node to the left of this node
     */
    public void setLeft(Node<T> left){
        this.left = left;
    }

    /**
     * Sets the node to the right of this node
     * @param right stores the node to the right of this node
     */
    public void setRight(Node<T> right){
        this.right = right;
    }

    /**
     * @return element contained in this node
     */
    public T getElement() {
        return element;
    }

    /**
     * @return node to the left of this node
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * @return node to the right of this node
     */
    public Node<T> getRight() {
        return right;
    }
}
