import java.util.Arrays;
public class ProfileMain {

    //Class to test profile functionality
    public static void main (String[] args){
        String[] interests = new String[0];
        String[] activities = new String[0];
        Profile testProfile = new Profile("Chris", "Clash", 1, 11, 2001, "chris@test.com", interests, activities);
        System.out.println(testProfile.toString());
        System.out.println(Arrays.toString(testProfile.getActivities()));
        System.out.println(Arrays.toString(testProfile.getInterests()));
    }
}
