import java.util.*;

public class MappingResult {
    private final Map<Integer, Integer> mapping = new LinkedHashMap<>();

    public MappingResult(int oldLineCount) {
        for (int i = 1; i <= oldLineCount; i++) {
            mapping.put(i, -1);
        }
    }

    public void addMatch(int oldLine, int newLine) {
        mapping.put(oldLine, newLine);
    }

    public Map<Integer, Integer> getMapping() {
        return mapping;
    }
}

