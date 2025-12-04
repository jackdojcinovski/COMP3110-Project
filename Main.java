import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path oldFile = Paths.get("pair1.txt");
        Path newFile = Paths.get("pair-1.txt");
        Path outputXml = Paths.get("output.xml");

        try {
            //Generate the mapping between old and new file line numbers
            MappingResult result = LineMapper.mapFiles(oldFile, newFile);

            //Produce the XML output 
            XMLWriter.writeXml("LineMappingTest", outputXml, result);

            System.out.println("Mapping complete. XML written to " + outputXml);
        } catch (IOException e) {
            //Basic error reporting
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}

