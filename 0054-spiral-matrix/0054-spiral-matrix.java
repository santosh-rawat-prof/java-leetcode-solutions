class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, right = col - 1;
        int top = 0, bottom = row - 1;
        
        List<Integer> list = new ArrayList<>();

        while(left <= right && top <= bottom ) {
            //Right Move
            for (int i = left; i <= right ; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            // Down Move
            for (int i = top; i <= bottom ; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            // Left Move
            if(top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Up Move
            if(left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}