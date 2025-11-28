import java.util.ArrayList;
import java.util.List;

public class MatchReport {

    private final String fileNameA;
    private final String fileNameB;
    private final List<MatchResult> results;

    public MatchReport(String fileNameA, String fileNameB) {
        this.fileNameA = fileNameA;
        this.fileNameB = fileNameB;
        this.results = new ArrayList<>();
    }

    public void addResult(MatchResult result) {
        results.add(result);
    }

    public List<MatchResult> getResults() {
        return results;
    }

    public int getTotalMatches() {
        return (int) results.stream().filter(MatchResult::isMatch).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Match Report: ")
          .append(fileNameA).append(" ↔ ").append(fileNameB)
          .append("\n\n");

        for (MatchResult r : results) {
            sb.append(r).append("\n");
        }

        sb.append("\nTotal Matches: ").append(getTotalMatches());

        return sb.toString();
    }
}
