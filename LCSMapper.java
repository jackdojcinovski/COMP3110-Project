import java.util.*;

public class LCSMapper {

    public static List<int[]> computeMatches(List<String> oldLines, List<String> newLines) {
        int m = oldLines.size();
        int n = newLines.size();

        int[][] dp = new int[m + 1][n + 1];

        // DP build
        for (int i = 1; i <= m; i++) {
            String a = oldLines.get(i - 1);
            for (int j = 1; j <= n; j++) {
                String b = newLines.get(j - 1);
                if (a.equals(b)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack matches
        List<int[]> matches = new ArrayList<>();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (oldLines.get(i - 1).equals(newLines.get(j - 1))) {
                matches.add(new int[]{i - 1, j - 1});
                i--; j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        Collections.reverse(matches);
        return matches;
    }
}

