import java.util.*;

public class LCSMapper {
//Computes matching line pairs using a LCS approach
//Finds best possible alignement between old and new files

    public static List<int[]> computeMatches(List<String> oldLines, List<String> newLines) {
        int m = oldLines.size();
        int n = newLines.size();

        int[][] dp = new int[m + 1][n + 1];

        // Build DP table
        for (int i = 1; i <= m; i++) {
            String a = oldLines.get(i - 1);
            for (int j = 1; j <= n; j++) {
                String b = newLines.get(j - 1);
                //If two lines match exaclty, extend LCS
                if (a.equals(b)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    //Otherwise take the larger of the two possible previous states
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Backtrack matches
        List<int[]> matches = new ArrayList<>();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            //Match is found
            if (oldLines.get(i - 1).equals(newLines.get(j - 1))) {
                matches.add(new int[]{i - 1, j - 1});
                i--; j--;
            } else if (dp[i - 1][j] >= dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        //Reverse so matches are in correct order
        Collections.reverse(matches);
        return matches;
    }
}

