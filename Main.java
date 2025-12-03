import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

<<<<<<< Updated upstream
        // Automatically use these fixed file names
=======

>>>>>>> Stashed changes
        Path oldFile = Paths.get("old.txt");
        Path newFile = Paths.get("new.txt");
        Path outputXml = Paths.get("output.xml");

        try {
<<<<<<< Updated upstream
            // Map lines
=======
            //Build mapping 
>>>>>>> Stashed changes
            MappingResult result = LineMapper.mapFiles(oldFile, newFile);

            // Write XML
            XMLWriter.writeXml("LineMappingTest", outputXml, result);

            System.out.println("Mapping complete. XML written to " + outputXml);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}
