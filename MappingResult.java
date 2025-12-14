import java.util.*;

public class MappingResult {
   
    //Store mappings of oldLine -> newLine

    private final Map<Integer, Integer> mapping = new LinkedHashMap<>();

    public MappingResult(int oldLineCount) {
        //Initialize every old line as -1
        for (int i = 1; i <= oldLineCount; i++) {
            mapping.put(i, -1);
        }
    }
    //For a matched pair
    public void addMatch(int oldLine, int newLine) {
        mapping.put(oldLine, newLine);
    }

    public Map<Integer, Integer> getMapping() {
        return mapping;
    }
}

