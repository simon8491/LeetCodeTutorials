import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        long temp = 1;
        for (int i = 1, up = rowIndex, down = 1; i <= rowIndex;i++, up--, down++)   {
            temp = temp * up / down;
            row.add((int)temp);
        }
        return row;
    }
}