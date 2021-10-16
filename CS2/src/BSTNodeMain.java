public class BSTNodeMain {

    // Class to test BSTNode class functionality
    public static void main (String[] args){
        String[] interests = new String[0];
        String[] activities = new String[0];
        Profile testProfile = new Profile("Chris", "Clash", 1, 11, 2001, "chris@test.com", interests, activities);
        BSTNode testNode = new BSTNode(testProfile);
        System.out.println(testNode.getProfile().toString());
        System.out.println(testNode.getLeft());
        System.out.println(testNode.getRight());
    }
}
