import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sna {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the input and output file names
        System.out.println("Enter input filename:");
        String inputFile = scanner.nextLine();
        System.out.println("Enter output filename:");
        String outputFile = scanner.nextLine();

        // Initialize counters for lines processed and non-ASCII characters stripped
        int linesProcessed = 0;
        int nonAsciiStripped = 0;

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                FileWriter writer = new FileWriter(outputFile)
        ) {
            String line;
            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                linesProcessed++;
                StringBuilder filteredLine = new StringBuilder();

                // Process each character in the line
                for (char character : line.toCharArray()) {
                    // Check if the character is ASCII by comparing its value
                    if (character < 128) {
                        filteredLine.append(character);
                    } else {
                        nonAsciiStripped++;
                    }
                }

                // Write the filtered line to the output file
                writer.write(filteredLine.toString() + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Display the results
        System.out.println("Processing complete.");
        System.out.println("Lines processed: " + linesProcessed);
        System.out.println("Non-ASCII characters stripped: " + nonAsciiStripped);
    }
}