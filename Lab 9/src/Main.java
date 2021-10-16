import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();
        ArrayList<String> patientDetails = new ArrayList<>();
        try {
            File patientFiles = new File("patients.txt");
            Scanner readFromFile = new Scanner(patientFiles);
            while (readFromFile.hasNextLine()) {
                patientDetails.add(readFromFile.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("An error has occurred");
        }
        addToQueue(patientDetails, patientQueue);
        outputQueue(patientQueue);

        System.out.println(max(2,2,2));
    }

    public static int max(int x, int y, int z){
        int max;
        if (x>y){
            if (x>z){
                max=x;
            } else {
                max = z;
            }
        } else {
            if (y > z){
                max = y;
            } else {
                max = z;
            }
        }
        return max;
    }
    /**
     * Constructs new patients and adds them to the priority queue
     * @param patientDetails
     * @param patientQueue
     */
    public static void addToQueue(ArrayList<String> patientDetails, PriorityQueue<Patient> patientQueue){
        int listPos = 0;
        while (listPos != patientDetails.size()){
            patientQueue.add(new Patient(patientDetails.get(listPos), patientDetails.get(listPos + 1),
                    patientDetails.get(listPos + 2), Integer.parseInt(patientDetails.get(listPos + 3))));
            listPos = listPos + 4;
        }
    }

    /**
     * Outputs the queue by using the Poll() method
     * @param patientQueue
     */
    public static void outputQueue(PriorityQueue<Patient> patientQueue){
        while (!patientQueue.isEmpty()){
            Patient current = patientQueue.poll();
            System.out.println(current.getFirstName() + " " + current.getSurname()
                    + " " + current.getIllness() + " " + current.getSeverity());
        }
    }
}


