import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

   public static void main(String []args) throws IOException {
      // Create File, Scanner, and String[] OBJECTS
      // use the format: ClassName objectName = new ClassName();
      File myFile = new File("pokemon.csv");
      Scanner scan = new Scanner(myFile);
      String[] pokemonLines = new String[152];

      // Initialize a line counter
      int i = 0; 
      // Loop through every line in the File using Scanner methods
      // Loop while Scanner can still find another line in the File AND our line counter is less than 10
      while ( scan.hasNext() && (i < 152) ) {
         // Read in the next line from the File
         String currentLine = scan.nextLine();
         // Assign the line to be stored in the Array
         pokemonLines[i] = currentLine;
         // Print out that line from the Array
         System.out.println( pokemonLines[i] );
         // Increment line counter
         i++;
      }

      System.out.println("DONE READING THE FILE!");

      // CALL OUR METHOD!
      randomPokemon( pokemonLines.length, pokemonLines );

   }

      // Method to print out a random Pokemon name
      public static void randomPokemon(int length, String[] pokemonLines) {
         // 1. Generate random int from 1 to array length
         int randIndex = (int) ( Math.random() * (length-1) + 1 );
         System.out.println(randIndex);

         // 2. Get pokemon at that index
         String randPokeLine = pokemonLines[randIndex];
         System.out.println( randPokeLine );

      }

} // END CLASS
