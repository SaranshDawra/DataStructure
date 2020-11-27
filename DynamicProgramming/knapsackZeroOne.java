package DynamicProgramming;

public class knapsackZeroOne {

	public static void main(String[] args) {
		int wt[] = { 1, 3, 4, 5 };
		int val[] = { 1, 4, 5, 7 };
		int w = 7;

		int dp[][] = new int[wt.length][w + 1];

		for (int i = 0; i < wt.length; i++) {
			for (int j = 0; j < w + 1; j++) {
				dp[i][j] = -1;
			}
		}

		int ans = recurciveKnapsack(wt, val, w, 0, 0);
		System.out.println(ans);

		ans = knapsackTD(wt, val, w, wt.length, dp);
		System.out.println(ans);

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		ans = knapsackBU(wt, val, w);
		System.out.println(ans);

	}

	public static int recurciveKnapsack(int wt[], int val[], int w, int profit, int vidx) {
		if (w == 0) {
			return profit;
		}

		if (vidx >= wt.length) {
			return profit;
		}

		if (wt[vidx] <= w) {
			int res1 = recurciveKnapsack(wt, val, w - wt[vidx], profit + val[vidx], vidx + 1);
			int res2 = recurciveKnapsack(wt, val, w, profit, vidx + 1);
			return Math.max(res1, res2);
		} else {
			return recurciveKnapsack(wt, val, w, profit, vidx + 1);
		}
	}

	public static int knapsackTD(int wt[], int val[], int w, int n, int[][] dp) {
		if (n == 0 || w == 0) {
			return 0;
		}

		if (dp[n - 1][w] != -1) {
			return dp[n - 1][w];
		}

		if (wt[n - 1] <= w) {
			int res1 = knapsackTD(wt, val, w - wt[n - 1], n - 1, dp);
			res1 += val[n - 1];
			int res2 = knapsackTD(wt, val, w, n - 1, dp);
			dp[n - 1][w] = Math.max(res1, res2);
			return dp[n - 1][w];
		} else {
			return dp[n - 1][w] = knapsackTD(wt, val, w, n - 1, dp);
		}
	}

	public static int knapsackBU(int wt[], int val[], int w) {
		int dp[][] = new int[wt.length + 1][w + 1];
		for (int i = 1; i < wt.length + 1; i++) {
			for (int j = 1; j < w + 1; j++) {
				if (wt[i - 1] <= j) {
					dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		for (int i = 0; i < wt.length + 1; i++) {
			for (int j = 0; j < w + 1; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

		return dp[wt.length][w];
	}

}
