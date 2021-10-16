
/**
 * This class reads a shape file.  For the format of this shape file, see the assignment description.
 * Also, please see the shape files ExampleShapes.txt, ExampleShapesStill.txt, and TwoRedCircles.txt
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;

public class ReadShapeFile {

	/**
	 * Reads the data file used by the program line by line
	 * and then creates each shape by calling the callConstruct subroutine
	 * @param in the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readLineByLine(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();
		while (in.hasNextLine()) {
			callConstruct(shapeQueue, in);
		}
		in.close();
		return shapeQueue;
	}

	/**
	 * Reads the name of the shape from scanner, and then uses a switch statement
	 * to call the corresponding constructor and add the shape to the queue
	 * @param shapeQueue the queue currently being used, shapes are enqueued to it
	 * @param in the scanner being used to read from the file
	 */
	private static void callConstruct(Queue<ClosedShape> shapeQueue, Scanner in){
		String shapeName = in.next();
		switch (shapeName){
			case "circle":
				shapeQueue.enqueue(constructCircle(in));
				break;
			case "oval":
				shapeQueue.enqueue(constructOval(in));
				break;
			case "square":
				shapeQueue.enqueue(constructSquare(in));
				break;
			case "rect":
				shapeQueue.enqueue(constructRect(in));
				break;
			case "triangle":
				shapeQueue.enqueue(constructTriangle(in));
				break;
			default:
				System.out.println("Invalid shape entered, please check formatting");
		}
	}

	/**
	 * Method to split the string read in, and then each parameter for the
	 * constructor is set, and a new oval object instantiated
	 * @param in scanner for the file
	 * @return a new oval object
	 */
	private static Oval constructOval(Scanner in){
		String currentLine = in.nextLine();
		String[] splitString = currentLine.split(" ");
		int x = Integer.parseInt(splitString[1]);
		int y = Integer.parseInt(splitString[2]);
		int vx = Integer.parseInt(splitString[3]);
		int vy = Integer.parseInt(splitString[4]);
		boolean filled = Boolean.parseBoolean(splitString[5]);
		int width = Integer.parseInt(splitString[6]);
		int height = Integer.parseInt(splitString[7]);
		int r = Integer.parseInt(splitString[8]);
		int g = Integer.parseInt(splitString[9]);
		int b = Integer.parseInt(splitString[10]);
		Color colour = Color.rgb(r, g, b);
		int insertTime = Integer.parseInt(splitString[11]);
		return new Oval(insertTime, x, y, vx, vy, width, height, colour, filled);
	}

	/**
	 * Method to split the string read in, and then each parameter for the
	 * constructor is set, and a new circle object instantiated
	 * @param in scanner for the file
	 * @return a new circle shape
	 */
	private static Circle constructCircle(Scanner in){
		String currentLine = in.nextLine();
		String[] splitString = currentLine.split(" ");
		int x = Integer.parseInt(splitString[1]);
		int y = Integer.parseInt(splitString[2]);
		int vx = Integer.parseInt(splitString[3]);
		int vy = Integer.parseInt(splitString[4]);
		boolean filled = Boolean.parseBoolean(splitString[5]);
		int diameter = Integer.parseInt(splitString[6]);
		int r = Integer.parseInt(splitString[7]);
		int g = Integer.parseInt(splitString[8]);
		int b = Integer.parseInt(splitString[9]);
		Color colour = Color.rgb(r, g, b);
		int insertTime = Integer.parseInt(splitString[10]);
		return new Circle(insertTime, x, y, vx, vy, diameter, colour, filled);
	}

	/**
	 * Method to split the string read in, and then each parameter for the
	 * constructor is set, and a new square instantiated
	 * @param in scanner for the file
	 * @return a new square shape
	 */
	private static Square constructSquare(Scanner in){
		String currentLine = in.nextLine();
		String[] splitString = currentLine.split(" ");
		int x = Integer.parseInt(splitString[1]);
		int y = Integer.parseInt(splitString[2]);
		int vx = Integer.parseInt(splitString[3]);
		int vy = Integer.parseInt(splitString[4]);
		boolean filled = Boolean.parseBoolean(splitString[5]);
		int side = Integer.parseInt(splitString[6]);
		int r = Integer.parseInt(splitString[7]);
		int g = Integer.parseInt(splitString[8]);
		int b = Integer.parseInt(splitString[9]);
		Color colour = Color.rgb(r, g, b);
		int insertTime = Integer.parseInt(splitString[10]);
		return new Square(insertTime, x, y, vx, vy, side, colour, filled);
	}

	/**
	 * Method to split the string read in, and then each parameter for the
	 * constructor is set, and a new rectangle instantiated
	 * @param in the scanner for the file
	 * @return a new rectangle object
	 */
	private static Rect constructRect(Scanner in){
		String currentLine = in.nextLine();
		String[] splitString = currentLine.split(" ");
		int x = Integer.parseInt(splitString[1]);
		int y = Integer.parseInt(splitString[2]);
		int vx = Integer.parseInt(splitString[3]);
		int vy = Integer.parseInt(splitString[4]);
		boolean filled = Boolean.parseBoolean(splitString[5]);
		int width = Integer.parseInt(splitString[6]);
		int height = Integer.parseInt(splitString[7]);
		int r = Integer.parseInt(splitString[8]);
		int g = Integer.parseInt(splitString[9]);
		int b = Integer.parseInt(splitString[10]);
		Color colour = Color.rgb(r, g, b);
		int insertTime = Integer.parseInt(splitString[11]);
		return new Rect(insertTime, x, y, vx, vy, width, height, colour, filled);
	}

	/**
	 * method to split the string read in, and then each parameter for the
	 * constructor is set, and a new triangle instantiated
	 * @param in the scanner for the file
	 * @return a new triangle shape
	 */
	private static Triangle constructTriangle(Scanner in){
		String currentLine = in.nextLine();
		String[] splitString = currentLine.split(" ");
		int x = Integer.parseInt(splitString[1]);
		int y = Integer.parseInt(splitString[2]);
		int vx = Integer.parseInt(splitString[3]);
		int vy = Integer.parseInt(splitString[4]);
		boolean filled = Boolean.parseBoolean(splitString[5]);
		int width = Integer.parseInt(splitString[6]);
		int height = Integer.parseInt(splitString[7]);
		int r = Integer.parseInt(splitString[8]);
		int g = Integer.parseInt(splitString[9]);
		int b = Integer.parseInt(splitString[10]);
		Color colour = Color.rgb(r, g, b);
		int insertTime = Integer.parseInt(splitString[11]);
		return new Triangle(insertTime, x, y, vx, vy, width, height, colour, filled);
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
		try {
			File inputFile = new File(filename);
			Scanner in = new Scanner(inputFile);
			return ReadShapeFile.readLineByLine(in);
		} catch (FileNotFoundException e) {
			System.out.println("Could not find " + filename);
			System.exit(0);
			return null;
		}
	}
}
