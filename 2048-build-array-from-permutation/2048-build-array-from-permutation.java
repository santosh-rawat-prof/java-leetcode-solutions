class Solution {
    public int[] buildArray(int[] nums) {
        int[] numsModified = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            numsModified[i] = nums[nums[i]];    
        }
        
        return numsModified;
    }
}