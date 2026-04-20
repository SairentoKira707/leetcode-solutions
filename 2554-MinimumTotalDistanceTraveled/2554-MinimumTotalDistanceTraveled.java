// Last updated: 20/04/2026, 15:55:08
class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a,b)-> a[0]-b[0]);
        int n=robot.size();
        int m=factory.length;
        long[][] dp = new long[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i], Long.MAX_VALUE);
        }
        for(int j=0;j<=m;j++){
            dp[n][j]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                dp[i][j]=dp[i][j+1];
                long cost=0;
                for(int k=0;k<factory[j][1] && i+k < n; k++){
                    cost+=Math.abs(robot.get(i+k)-factory[j][0]);
                    if(dp[i+k+1][j+1]!=Long.MAX_VALUE){
                        dp[i][j]=Math.min(dp[i][j],cost + dp[i+k+1][j+1]);
                    }
                }
            }
        }
        return dp[0][0];
    }
}