import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class LineMapper {

    public static MappingResult mapFiles(Path oldFile, Path newFile) throws IOException {
        List<String> oldLines = FileLoader.loadLines(oldFile, true);
        List<String> newLines = FileLoader.loadLines(newFile, true);

        MappingResult result = new MappingResult(oldLines.size());
        List<int[]> matches = LCSMapper.computeMatches(oldLines, newLines);

        for (int[] pair : matches) {
            int oldIndex = pair[0] + 1;
            int newIndex = pair[1] + 1;
            result.addMatch(oldIndex, newIndex);
        }

        return result;
    }
}
