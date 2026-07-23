class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return ans(nums,dp,0);
        
    }
    public int ans(int[] nums,int[] dp,int i){
        if(i>=nums.length){
            return 0;
        }
  
        if(dp[i]!=-1){
          return dp[i];
        }
        int rob=nums[i]+ans(nums,dp,i+2);
        int skip=ans(nums,dp,i+1);
        return dp[i]=Math.max(rob,skip);
    }
}
