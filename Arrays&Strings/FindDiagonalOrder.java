class FindDiagonalOrder {
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length; // horizontal
        int n = mat[0].length; //vertical
        int row = 0, column = 0;
        // intialize new array for the result
        int[] result = new int[m*n];
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[row][column];
            if ((row + column) % 2 == 0) { // diagonal moving up
                if (column == n - 1) {
                    row++;
                } else if (row == 0) {
                    column++;
                } else {
                    row--;
                    column++;
                }
            } else { // diagonal moving down
                if (row == m - 1) {
                    column++;
                } else if (column == 0) {
                    row++;
                } else {
                    row++;
                    column--;
                }
            }
        }
        return result;
    }
}