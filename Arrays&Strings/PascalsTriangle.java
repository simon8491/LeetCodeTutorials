import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // Base case: if numRows is 0, return empty list
        if (numRows == 0)
            return triangle;
        // Initialize the first row with 1
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        // Generate subsequent rows
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            // The first element in each row is always 1
            row.add(1);
            // Each interior element is the sum of the elements above-left and above-right
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            // The last element in each row is always 1
            row.add(1);
            triangle.add(row);
        }
        return triangle; 
    }
}