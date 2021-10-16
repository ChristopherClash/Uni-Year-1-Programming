import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


//THIS CLASS IS INCOMPLETE. I HAVE NOT BEEN ABLE TO SUCCESSFULLY COMPLETE TASK 6

public class Graph {
    private BST profileBST;
    private File friendsFile;
    private ArrayList<Profile> profiles = new ArrayList<>();

    /**
     * Constructs a graph of friend relationships from a given BST of profiles and a .txt of friend relationships
     * Subsequently uses this graph to recommend new friends using triadic closure
     * @param tree - the BST of profiles
     * @param filename -  the .txt of friend relationships
     */
    public Graph(BST tree, String filename){
        profileBST = tree;
        friendsFile = new File(filename);
    }


    public ArrayList<BST> friendRecommendations(ArrayList<Profile> users){
        ArrayList<BST> friendRecommendationTrees = new ArrayList<>();

        return friendRecommendationTrees;
    }

    /**
     * Reads friend relationships from the .txt passed into the constructor,
     * checks if each of the names in the file is in the BST by calling the getBSTNode
     * method from the BST class
     *
     * @throws FileNotFoundException if the .txt cannot be found
     */
    public void createGraph() throws FileNotFoundException {
        Scanner readIn = new Scanner(friendsFile);
        while (readIn.hasNextLine()) {
            String currentLine = readIn.nextLine();
            Scanner nextProfile = new Scanner(currentLine);
            nextProfile.useDelimiter(",");
            while (nextProfile.hasNext()) {
                String friend = nextProfile.next();
                Profile profileToList = profileBST.getBSTNode(friend).getProfile();
                profiles.add(profileToList);
            }
        }
        readIn.close();
    }

    /**
     * For each profile add the corresponding friend profiles through the
     * insertFriends method in Profile
     *
     * @param profiles - arraylist of profiles that are friends with each other
     * @return arraylist of profiles that are friends with each other
     *
     * 
     */
    public ArrayList<Profile> getProfiles(ArrayList<Profile> profiles){

        return profiles;
        }
}
