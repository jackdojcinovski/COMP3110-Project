import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Main <oldFile> <newFile> <outputXml>");
            return;
        }

        Path oldFile = Paths.get(args[0]);
        Path newFile = Paths.get(args[1]);
        Path outputXml = Paths.get(args[2]);

        try {
            // Map lines
            MappingResult result = LineMapper.mapFiles(oldFile, newFile);

            // Write XML
            XMLWriter.writeXml("LineMappingTest", outputXml, result);

            System.out.println("Mapping complete. XML written to " + outputXml);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}
