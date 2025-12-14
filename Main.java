import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println(" LINE MAPPING TOOL");
        System.out.println("------------------------------------------");
        System.out.println("Input Template:");
        System.out.println(" - Old files follow the format:  pair-#.txt  (example: pair-#.txt/asm/java)");
        System.out.println(" - New files follow the format:  pair#.txt   (example: pair#.txt/asm/java)");
        System.out.println(" - Valid range for # is 1 to 30");
        System.out.println("Output will automatically be written to: output.xml");
        System.out.println("-----------------------------------------\n");

        Scanner scanner = new Scanner(System.in);

        // Ask user for old file name
        System.out.print("Enter old file name: ");
        String oldName = scanner.nextLine().trim();

        // Ask user for new file name
        System.out.print("Enter new file name: ");
        String newName = scanner.nextLine().trim();

        // Paths for processing
        Path oldFile = Paths.get(oldName);
        Path newFile = Paths.get(newName);
        Path outputXml = Paths.get("output.xml"); // fixed output name

        try {
            // Generate line mapping
            MappingResult result = LineMapper.mapFiles(oldFile, newFile);

            // Write XML output
            XMLWriter.writeXml("LineMapping", outputXml, result);

            System.out.println("\nMapping complete!");
            System.out.println("XML written to: " + outputXml.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }

        scanner.close();
    }
}
