package fileio;

import java.io.*;
import java.util.Scanner;

/**
 * Problem 2. Practice using Scanner class to read text from a file. Using Scanner
 * because I have no knowledge of the data structure, except it is space delineated.
 * Has to print out to the terminal in the following format:
 * Task#: num
 * Task: task description
 * Date: mm/dd/yyyy
 *
 * Note: Lesson learned, you have to reset the delimiter for the scanner.
 */
public class Main {

    public static void main(String[] args) throws IOException{
        String sourcePath = "C:\\Users\\leram\\Java\\WriteTaskFileExercise\\src\\fileio\\taskPrintWriter.txt";
        File fIn = new File( sourcePath );
        Scanner input = new Scanner(new BufferedReader( new FileReader( fIn ) ));
        input.useDelimiter( "  " );
        String taskNum;
        String taskDescription;
        String dueDate;

        input.nextLine();
        input.nextLine();

        while( input.hasNext( ) )
        {
            taskNum = input.useDelimiter( " " ).next().trim();
            taskDescription = input.useDelimiter( "      " ).next().trim();
            dueDate = input.useDelimiter( "             " ).nextLine().trim();
            System.out.println("Task#: " + taskNum);
            System.out.println("Task: " + taskDescription );
            System.out.println("Date: " + dueDate );
            System.out.println( );
        }
        input.close();
    }
}
