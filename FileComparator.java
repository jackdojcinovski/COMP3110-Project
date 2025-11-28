import java.util.List;

import data.FileData;
import data.LineData;

public class FileComparator {

    private final LineMatcher matcher = new LineMatcher();

    /**
     * Compare two FileData objects line-by-line.
     */
    public MatchReport compare(FileData fileA, FileData fileB) {

        MatchReport report = new MatchReport(
                fileA.getFileName(), fileB.getFileName()
        );

        List<LineData> linesA = fileA.getLines();
        List<LineData> linesB = fileB.getLines();

        int max = Math.max(linesA.size(), linesB.size());

        for (int i = 0; i < max; i++) {

            String textA = (i < linesA.size()) ? linesA.get(i).getText() : "";
            String textB = (i < linesB.size()) ? linesB.get(i).getText() : "";

            boolean match = matcher.linesMatch(textA, textB);
            double score = matcher.similarityScore(textA, textB);

            MatchResult result = new MatchResult(
                i + 1,
                i + 1,
                textA,
                textB,
                match,
                score
            );

            report.addResult(result);
        }

        return report;
    }
}
