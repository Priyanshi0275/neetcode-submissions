class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int pbefore=1;
        int pafter=1;
        for(int i=0;i<n;i++){
            res[i]=pbefore;
            pbefore*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=pafter;
            pafter*=nums[i];
        }
        return res;
    }
}  
