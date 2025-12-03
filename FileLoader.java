import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.*;

public class FileLoader {
    //Reads all lines from a file and trims whitespace
    public static List<String> loadLines(Path path, boolean normalizeWhitespace) throws IOException {
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        if (!normalizeWhitespace) return lines;//Base Case
        //Remove leading/trailing whitespace from each line
        List<String> normalized = new ArrayList<>();
        for (String line : lines) {
            normalized.add(line.strip());
        }
        return normalized;
    }
}
