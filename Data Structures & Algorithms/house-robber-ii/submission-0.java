class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(ans(nums,1,n-1),ans(nums,0,n-2));
        
    }
    public int ans(int[] nums,int st,int end){
        int next1=0;
        int next2=0;
        for(int i=end;i>=st;i--){
           int curr=Math.max(nums[i]+next2,next1);
           next2=next1;
           next1=curr;
        }
        return next1;
    }
}
