class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];

        for(int i = 0; i < n; i++) {
            shuffledArray[2 * i] = nums[i];
            shuffledArray[2 * i + 1] = nums[i + n];
        }
        
        return shuffledArray;
    }
}
