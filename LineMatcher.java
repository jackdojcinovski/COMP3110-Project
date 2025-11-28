public class LineMatcher {

    public boolean linesMatch(String lineA, String lineB) {
        if (lineA == null || lineB == null) return false;
        return lineA.trim().equals(lineB.trim());
    }
    public double similarityScore(String lineA, String lineB) {
        return linesMatch(lineA, lineB) ? 1.0 : 0.0;
    }
}
