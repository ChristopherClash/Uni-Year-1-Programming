public class BSTMain {

    //Class to test Binary Search Tree functionality
    public static void main(String[] args) {
        String[] interests = new String[0];
        String[] activities = new String[0];
        Profile testProfile = new Profile("Chris", "Clash", 1, 11, 2001, "Chris@test.com", interests, activities);
        Profile testProfile2 = new Profile("Jack", "Jackson", 2, 3, 2004, "Jack@Test.com", interests, activities);
        Profile testProfile3 = new Profile("Ants", "Sweeney", 27, 12, 2000, "Ants@test.com", interests, activities);
        Profile testProfile4 = new Profile("Oli", "Brown", 16, 8, 2002, "Oli@test.com", interests, activities);
        Profile testProfile5 = new Profile("Sam", "Crofts", 12, 3, 2001, "Sam@test.com", interests, activities);
        Profile testProfile6 = new Profile("Benjamin", "Fearon", 4, 7, 2001, "Ben@test.com", interests, activities);

        BST testBST = new BST();
        testBST.addProfile(testProfile);
        testBST.addProfile(testProfile2);
        testBST.addProfile(testProfile3);
        testBST.addProfile(testProfile4);
        testBST.addProfile(testProfile5);
        testBST.addProfile(testProfile6);
        System.out.println(testBST.getBSTNode("Chris").getProfile().toString() + " successfully found");
        testBST.callPreOrderTrav();
    }
}
