import java.io.FileNotFoundException;
public class FileReaderMain {

    //Class to test file-reader functionality
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "profiles.txt";
        BST testBST = FileReader.readProfileSet(filename);
        testBST.printAlphabeticalASC();
    }
}

