class Solution {
    boolean check(int[] piles,int h,int k){
        long hour=0;
        for(int p:piles){
            hour+=(int)Math.ceil((double)p/k);
        }
        return hour<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(piles,h,mid)){
                ans=mid;
               high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}