class Solution {
    public int trap(int[] ht) {
       int n=ht.length;
       int total=0;
       int lmax=0;
       int rmax=0;
       int start=0;
       int end=n-1;
       while(start<end){
        lmax=Math.max(lmax,ht[start]);
        rmax=Math.max(rmax,ht[end]);
        if(lmax<rmax){
            total+=lmax-ht[start];
            start++;
        }else{
            total+=rmax-ht[end];
            end--;
        }
       }
       return total;
    }
}
