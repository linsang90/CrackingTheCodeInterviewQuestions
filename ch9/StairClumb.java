
/*
 * Q 9.1(pg 109)
 * Name: Sang Lin
 * Date: 09.02.2015
 */
public class StairClumb {
	public static int countWays(int n) {
		int[] dp = new int[n + 1];
		if(n > 0) dp[1] = 1;
		if(n > 1) dp[2] = 2;
		if(n > 2) dp[3] = 4;
		
		for(int i = 4; i <= n; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}
		return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(countWays(4));
	}
}
