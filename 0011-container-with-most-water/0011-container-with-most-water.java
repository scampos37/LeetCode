class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, max = 0;
        while (left < right){
            int w = right - left;
            int h = 0;
            if (height[left] < height[right]) h = height[left];
            else h = height[right];
            int area = w * h;
            if (area > max) max = area;
            if (height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else{
                left++;
                right--;
            }
        }
        return max;
    }
}