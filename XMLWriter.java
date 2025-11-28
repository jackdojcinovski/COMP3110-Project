import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class XMLWriter {

    public static void writeXml(String testName, Path output, MappingResult result) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<TEST NAME=\"%s\">\n", testName));
        sb.append("  <VERSION NUMBER=\"1\" CHECKED=\"TRUE\">\n");

        for (Map.Entry<Integer, Integer> e : result.getMapping().entrySet()) {
            sb.append(String.format("    <LOCATION ORIG=\"%d\" NEW=\"%d\"/>\n",
                    e.getKey(), e.getValue()));
        }

        sb.append("  </VERSION>\n</TEST>\n");

        Files.writeString(output, sb.toString(), StandardCharsets.UTF_8);
    }
}
