import java.util.ArrayList;
import java.util.List;

class SpiralOrder {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int hBorder = matrix.length-1;
        int vBorder = matrix[0].length-1;
        int row = 0;
        int column = 0;

        while (row <= hBorder && column <= vBorder) {
            for (int i = column; i <= vBorder; i++) {
                result.add(matrix[row][i]);
            }
            row++;
            for (int j = row; j <= hBorder; j++) {
                result.add(matrix[j][vBorder]);
            }
            vBorder--;
            if (row <= hBorder) {
                for (int k = vBorder; k >= column; k--) {
                    result.add(matrix[hBorder][k]);
                }
                hBorder--;
            }
            if (column <= vBorder) {
                for (int l = hBorder; l >= row; l--) {
                    result.add(matrix[l][column]);
                }
                column++;
            }
        }
        return result;
    }
}