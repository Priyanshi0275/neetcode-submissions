class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return ans(coins,dp,amount,0);
    }
    public int ans(int[] coins,int[][] dp,int amount,int idx){
        if(idx==coins.length){
            return 0;
        }
        if(amount==0) return 1;
        if(dp[idx][amount]!=-1) return dp[idx][amount];
        int take=0;
        if(coins[idx]<=amount){
            take=ans(coins,dp,amount-coins[idx],idx);
        }
        int nottake=ans(coins,dp,amount,idx+1);
        return dp[idx][amount]=take+nottake;
    }
}
