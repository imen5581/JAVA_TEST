package SetOfThings;

/**
 * Created by Оператор on 14.09.2019.
 */
public class Main {
    public static void main(String[] args) {

    }


    public static int knapsack(int weights[], int costs[], int needed) {
        int n = weights.length;
        int dp[][] = new int[needed + 1][n + 1];
        for (int j = 1; j <= n; j++) {
            for (int w = 1; w <= needed; w++) {
                if (weights[j - 1] <= w) {
                    dp[w][j] = Math.max(dp[w][j - 1], dp[w - weights[j - 1]][j - 1] + costs[j - 1]);
                } else {
                    dp[w][j] = dp[w][j - 1];
                }
            }
        }
        return dp[needed][n];
    }
}
