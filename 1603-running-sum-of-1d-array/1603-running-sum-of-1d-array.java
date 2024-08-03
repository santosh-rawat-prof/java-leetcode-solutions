class Solution {
    public int[] runningSum(int[] nums) {
        int[] num = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
                if(i > 0) {
                    num[i] = nums[i] + num[i-1];
                } else {
                    num[i] = nums[i];
                }
            }
        return num;
    }
}