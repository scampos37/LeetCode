class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Allows for duplicates to be ignored
        Set<List<Integer>> resultSet = new HashSet();
        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 3 && nums[i] <= 0;){
            //left pointer starts at the number directly to the right of current number
            //and right pointer starts at the end of the array
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                // if sum is too big, move the right pointer over
                if (sum > 0) {
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {right--;} //skip duplicated number
                } else {
                    //adds number to results if sum = 0 and moves right pointer left
                    if (sum == 0) {
                        resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        right--;
                        while (left < right && nums[right] == nums[right + 1]) {right--;} //skips duplicated number
                    }
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {left++;} //skips duplicated number
                }
            }
            i++;
            while(i < nums.length - 2 && nums[i] == nums[i - 1]) {i++;} //skips duplicated number
        }
        //turns hashSet into Array List
        return new ArrayList<>(resultSet);
    }
}