import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class XMLWriter {
    //Writes line mapping to XML structure

    public static void writeXml(String testName, Path output, MappingResult result) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<TEST NAME=\"%s\">\n", testName));
        sb.append("  <VERSION NUMBER=\"1\" CHECKED=\"TRUE\">\n"); //Always add
        
        //Each mapping entry as XML tag, ORIg is old file line number, NEW is corresponding line number in new file
        for (Map.Entry<Integer, Integer> e : result.getMapping().entrySet()) {
            sb.append(String.format("    <LOCATION ORIG=\"%d\" NEW=\"%d\"/>\n",
                    e.getKey(), e.getValue()));
        }

        sb.append("  </VERSION>\n</TEST>\n");

        Files.writeString(output, sb.toString(), StandardCharsets.UTF_8);
    }
}
