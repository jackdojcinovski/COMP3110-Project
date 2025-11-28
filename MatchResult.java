public class MatchResult {

    private final int lineNumberA;
    private final int lineNumberB;
    private final String textA;
    private final String textB;
    private final boolean isMatch;
    private final double score;

    public MatchResult(int lineNumberA, int lineNumberB,String textA, String textB, boolean isMatch, double score) {
        this.lineNumberA = lineNumberA;
        this.lineNumberB = lineNumberB;
        this.textA = textA;
        this.textB = textB;
        this.isMatch = isMatch;
        this.score = score;
    }

    public int getLineNumberA() { return lineNumberA; }
    public int getLineNumberB() { return lineNumberB; }
    public String getTextA() { return textA; }
    public String getTextB() { return textB; }
    public boolean isMatch() { return isMatch; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return "Line " + lineNumberA + " ↔ Line " + lineNumberB +
               " | Match: " + isMatch + " | Score: " + score;
    }
}
