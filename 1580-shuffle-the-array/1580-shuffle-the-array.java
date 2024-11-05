class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = 2*n;
        int[] shuffledArray = new int[len];

        int p1 = 0, p2 = n;

        for(int i = 0; i < len; i++) {
            if(i % 2 == 0) {
                shuffledArray[i] = nums[p1];
                p1++;
            } else {
                shuffledArray[i] = nums[p2];
                p2++;
            }
        }
        return shuffledArray;
    }
}