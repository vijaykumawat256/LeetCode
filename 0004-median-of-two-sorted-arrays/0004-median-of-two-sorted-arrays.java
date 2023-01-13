class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len = nums1.length +nums2.length;
        int[] mergedarr = new int[len];
        
        for(int i=0;i<nums1.length;i++){
            mergedarr[i]=nums1[i];
        }
        for(int j=0; j<nums2.length;j++){
            mergedarr[j+nums1.length]=nums2[j];
            
        }
        Arrays.sort(mergedarr);
        double avg=0;
        if(len%2==0){
            avg=(double)(mergedarr[len/2 -1]+mergedarr[len/2])/2;
        }
        else{
            avg=mergedarr[len/2 ];
        }
        
        return avg;
    }
}