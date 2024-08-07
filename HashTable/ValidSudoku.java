/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

1. Each row must contain the digits 1-9 without repetition.
2. Each column must contain the digits 1-9 without repetition.
3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 */
import java.util.HashSet;

class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> check = new HashSet<>();

        for (int row = 0; row < 9; row++)   {
            for (int column = 0; column < 9; column++) {
                char number = board[row][column];   //to pick the char from the board to be added to sudoku
                if (number != '.') {    //check the empty place in the board to be abble to add the number
                    //since the addition in the HashSet returns also TRUE or FALSE statement based on the succes of the operation
                    if (!check.add(number+ " in row " +row) ||
                        !check.add(number+ " in column " +column) ||
                        !check.add(number+ " in block " +(row/3)+(column/3))) {   //to define also the presence of the number in the block
                        return false;
                    }
                }
            }
        }
        return true;
    }
}