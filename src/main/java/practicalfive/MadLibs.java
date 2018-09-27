package practicalfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/** This class has a method that creates a Mid Libs story.
 * The program utilizes the words in a text file.
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Janyl Jumadinova
 */

public class MadLibs {

  /** The main entry point for MadLibs.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window.
   *
   **/
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Janyl Jumadinova " + new Date());
    // declare the starting file and scanner
    File wordInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      wordInputsFile = new File("input/madlibs_inputs.txt");
      scanner = new Scanner(wordInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and save the input from the text file

    // Step Two: Display the words and numbers in a Mad Libs story

    // Step Three: Display a final thank you message

  }

}
