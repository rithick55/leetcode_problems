class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int m=nums1.length;
        int[] merge=new int[n+m];
        System.arraycopy(nums1,0,merge,0,m);
        System.arraycopy(nums2,0,merge,m,n);
        Arrays.sort(merge);
        double median;
        int a=merge.length;
        if(a%2!=0){
            median=merge[a/2];
        }
        else{
             median=(merge[(a/2)-1]+merge[a/2])/2.0;
        }
        return median;
    }
}