	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter n to get the nth Bell Number");
	    int n = input.nextInt();
		int dp[][] = new int[n+1][n+1];
		if(n == 1){
		    System.out.println("1");
		    return;
		}
		dp[0][0] = 1;
		for(int i =1;i<=n;i++){
		    dp[i-1][0] = dp[i-1][i-1];
		    for(int j =1;j<=n;i++){
		        dp[i][j] = dp[i-1][j-1]+dp[i][j-1];
		    }
		}
		System.out.println(dp[n][0]);
	}
