class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int res=ans(coins,dp,amount,0);
        return res==(int)1e9?-1:res;
    }
    public int ans(int[] coins,int[][] dp,int amount,int idx){
        if(idx==coins.length){
            return (int)1e9;
        }
        if(amount==0) return 0;
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        int take=(int)1e9;
        if(coins[idx]<=amount)
           take=1+ans(coins,dp,amount-coins[idx],idx);
        int nottake=ans(coins,dp,amount,idx+1);
        return dp[idx][amount]=Math.min(take,nottake);
    }
}
