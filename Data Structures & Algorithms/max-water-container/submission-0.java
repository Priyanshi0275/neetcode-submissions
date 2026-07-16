class Solution {
    public int maxArea(int[] ht) {
        int n=ht.length;
        int lp=0;
        int rp=n-1;
        int max=0;
        while(lp<rp){
            int wt=rp-lp;
            int h=Math.min(ht[lp],ht[rp]);
            int currmax=wt*h;
            max=Math.max(currmax,max);
            if (ht[lp] < ht[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }
}
