// T.c = O(n) and S.c = O(n)
class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] nearestLeftL = new int[n];      // Nearest 'L' to the right of each index
        int[] nearestRightR = new int[n];     // Nearest 'R' to the left of each index

        // Pass 1: Track nearest 'R' from the left
        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R')
                nearestRightR[i] = i;
            else if (dominoes.charAt(i) == '.')
                nearestRightR[i] = i > 0 ? nearestRightR[i - 1] : -1;
            else
                nearestRightR[i] = -1;
        }

        // Pass 2: Track nearest 'L' from the right
        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L')
                nearestLeftL[i] = i;
            else if (dominoes.charAt(i) == '.')
                nearestLeftL[i] = (i < n - 1) ? nearestLeftL[i + 1] : -1;
            else
                nearestLeftL[i] = -1;
        }

        // Build the final result
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int distToL = nearestLeftL[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - nearestLeftL[i]);
            int distToR = nearestRightR[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - nearestRightR[i]);

            if (distToL == distToR)
                result.append('.');
            else if (distToR < distToL)
                result.append('R');
            else
                result.append('L');
        }
        return result.toString();
    }
}
