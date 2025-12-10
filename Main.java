import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Note: pair-# are old files and pair# are new files. Range for numbers is 1-25");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter old file name: ");
        String oldName = scanner.nextLine().trim();

        System.out.print("Enter new file name: ");
        String newName = scanner.nextLine().trim();

        System.out.print("Enter output XML file name: ");
        String outputName = scanner.nextLine().trim();

        Path oldFile = Paths.get(oldName);
        Path newFile = Paths.get(newName);
        Path outputXml = Paths.get(outputName);

        try {
            MappingResult result = LineMapper.mapFiles(oldFile, newFile);
            XMLWriter.writeXml("LineMapping", outputXml, result);

            System.out.println("Mapping complete! XML written to " + outputXml.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}
