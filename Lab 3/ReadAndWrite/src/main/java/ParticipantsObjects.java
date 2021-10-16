import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ParticipantsObjects {

    static ArrayList<Participant> array = new ArrayList<>();
            
    public static void main(String[] args) throws FileNotFoundException {
        printMenu();
        Scanner userInput = new Scanner(System.in);
        int menuChoice = userInput.nextInt();
        if (menuChoice == 1){
            readIn();
        }
        else if (menuChoice == 2){
            readIn();
            outputToFile();
        }
    }

    public static void readIn() throws FileNotFoundException {
        int sumOfIntervals = 0, noOfLines = 0;
        File folder = new File("C:\\University\\Java Programs\\Lab 3\\ReadAndWrite\\data_set");
        File[] listOfFiles = folder.listFiles(); /* create list of all files */
        if (listOfFiles != null) { /* check if there are files to begin with */
            for (int filePosition = 0; filePosition < (listOfFiles).length; filePosition++) { /* for the number of files */
                File currentFile = listOfFiles[filePosition];
                Scanner in = new Scanner(currentFile);
                while (in.hasNextLine()){ /* check if there's a next line in the file */
                    String data = in.nextLine();
                    int interval = Integer.parseInt(data); /*convert read in string into an int value*/
                    sumOfIntervals = sumOfIntervals + interval;
                    noOfLines++;
                }
                int mean = sumOfIntervals / noOfLines;
                Participant current = new Participant(calcPartID(filePosition), calcDate(), calcTime(), mean); /* creates new participant object and add to array */
                array.add(current);
            }
        }
    }

    public static void outputToFile() {
        System.out.println("Writing to file!");
        File outputFile = new File ("OUTPUT.txt"); /* create new text file called OUTPUT */
        PrintWriter writeToFile = null;
        try{
            writeToFile = new PrintWriter(outputFile);
        }
        catch (FileNotFoundException e) {
            System.out.println("Cannot open OUTPUT.txt");
            System.exit (0);
        }
        writeToFile.println("ParticipantID  DateOfCollection  TimeOfCollection  HR");
        for (Participant elem : array){ /* for every element in the array */
            System.out.println(elem.getParticipantID() + " " + elem.getCollectionDate() + " "
                    + elem.getCollectionTime() + " " + elem.getHeartRate());
            writeToFile.printf("%-1s  %20s  %16s  %9d\n", elem.getParticipantID(), elem.getCollectionDate(), elem.getCollectionTime()
                    , elem.getHeartRate()); /* writes to file with buffer */
        }
        writeToFile.close();

    }

    private static void printMenu(){
        System.out.println("*** Welcome to my Program to Compute"
                + " Heart Rate *** \n");
        System.out.println("Enter '1' to compute Heart Rate "
                + "for all the participants.");
        System.out.println("Enter '2' to write all the data of "
                + "all participants to a file.");
    }

    private  static String calcPartID(int filePosition){
        return "P" + (filePosition + 1);
    }

    private static String calcDate(){ /* returns a formatted string of the date, with each number being random */
        Random rand = new Random();
        int day = 30 - rand.nextInt(28);
        int month = 12 - rand.nextInt(11);
        int year = 2021 - rand.nextInt(4);
        return String.format("%d-%d-%d", year, month, day);
    }

    private static String calcTime(){ /* returns a formatted string of the time, with each number being random */
        Random random = new Random();
        int seconds = random.nextInt(59) + 1;
        int minutes = random.nextInt(59) + 1;
        int hours = random.nextInt(23) + 1;
        return String.format("%d-%d-%d", hours, minutes, seconds);
    }
}
