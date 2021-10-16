import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    /**
     * Constructs new BST by reading in profiles from a .txt file line by line and adding each profile to the tree. It
     * calls the createProfile method to construct the profiles before adding them.
     * @param filename - the .txt file to be read from
     * @return the constructed BST
     */
    public static BST readProfileSet (String filename) throws FileNotFoundException {
        BST tree = new BST();
        String currentLine;
        File profileFile = new File(filename);
            Scanner readIn = new Scanner(profileFile);
            while (readIn.hasNextLine()) {
                currentLine = readIn.nextLine();
                Profile profileToAdd = createProfile(splitCurrentLine(currentLine));
                tree.addProfile(profileToAdd);
            }
            readIn.close();
        return tree;
    }

    /**
     * Splits the current line that the scanner in readProfileSet is on and adds each token to
     * an arraylist which is then passed to the constructProfile method
     * @param currentLine - the line in the .txt file that the scanner in readProfileSet is on
     * @return an arraylist of all the tokens on that line
     */
    private static ArrayList<String> splitCurrentLine (String currentLine){
        ArrayList<String> profileComponents = new ArrayList<>();
        String component;
        Scanner splitLine = new Scanner(currentLine);
        splitLine.useDelimiter(",");
        while (splitLine.hasNext()){
            component = splitLine.next();
            profileComponents.add(component);
        }
        return profileComponents;
    }

    /**
     * Constructs a new Profile from the contents of the arraylist passed to it by splitCurrentLine
     * @param profileComponents - the arraylist of components needed to construct a new profile
     * @return a constructed profile
     */
    private static Profile createProfile (ArrayList<String> profileComponents){
        String firstName = profileComponents.get(1);
        String surname = profileComponents.get(0);
        int dayOB = Integer.parseInt(profileComponents.get(2));
        int monthOB = Integer.parseInt(profileComponents.get(3));
        int yearOB = Integer.parseInt(profileComponents.get(4));
        String email = profileComponents.get(5);
        String[] interests = populateInterests(profileComponents.get(6));
        String[] activities = populateActivities(profileComponents.get(7));
        return new Profile(firstName,surname,dayOB,monthOB,yearOB,email,interests,activities);
    }

    /**
     * Adds all of the interests from the .txt to a new array
     * @param listOfInterests the string of all interests, taken from the .txt file
     * @return an array of the user's interests to be used in profile construction
     */
    private static String[] populateInterests(String listOfInterests){
        return listOfInterests.split(";");
    }

    /**
     * Adds all of the activities from the .txt to a new array
     * @param listOfActivities the string of all activities, taken from the .txt file
     * @return an array of the user's activities to be used in profile construction
     */
    private static String[] populateActivities(String listOfActivities){
        return listOfActivities.split(";");
    }

}
