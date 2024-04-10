class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] sorted = new int[size/2+1];
        int l = 0, r = 0;
        for(int i = 0; i < size/2 + 1; i ++){
            if (l == nums1.length){
                sorted[i] = nums2[r++];
            }else if (r == nums2.length){
                sorted[i] = nums1[l++];
            }else{
                if (nums1[l] <= nums2[r]){
                    sorted[i] = nums1[l++];
                }else{
                    sorted[i] = nums2[r++];
                }
            }
        }
        int half = size/2;
        double median = 0;
        if (size % 2 == 0){
            median = (double)(sorted[half] + sorted[half-1]) / 2;

        }else{
            median = sorted[half];
        }
        return median;
    }
}