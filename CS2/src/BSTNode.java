public class BSTNode implements Comparable<BSTNode> {
    Profile data;
    BSTNode l;
    BSTNode r;

    /**
     * Constructs new BSTNode containing a profile object
     * @param data
     */
    public BSTNode(Profile data){
        this.data = data;
    }

    /**
     *
     * @return profile object contained by this node
     */
    public Profile getProfile(){
        return data;
    }

    /**
     * Sets the node to the left of this node
     * @param l - node to the left of this node
     */
    public void setLeft(BSTNode l){
        this.l = l;
    }

    /**
     * Sets the node to the right of this node
     * @param r - node to the right of this node
     */
    public void setRight(BSTNode r){
        this.r = r;
    }

    /**
     *
     * @return the node to the left of this node
     */
    public BSTNode getLeft(){
        return this.l;
    }

    /**
     *
     * @return the node to the right of this node
     */
    public BSTNode getRight(){
        return this.r;
    }

    /**
     * overridden method to compare the firstname component of the profile held by this node to another, part of the
     * priority queue method in the BST class
     * @param otherNode-  node that current node is being compared to
     * @return integer value denoting where in priority queue this node should be placed
     */
   @Override
   public int compareTo(BSTNode otherNode){
        if (this.getProfile().getFirstName().compareTo(otherNode.getProfile().getFirstName()) > 0){
            return 1;
        }
        else if (this.getProfile().getFirstName().compareTo(otherNode.getProfile().getFirstName()) == 0){
            return 0;
        }
        else if (this.getProfile().getFirstName().compareTo(otherNode.getProfile().getFirstName()) < 0){
            return -1;
        }
        return 0;
   }
}
