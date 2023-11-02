class Solution {

    /** Given a 2D array of chars representing a sudoku board, return if it is valid
        or not (No duplicate numbers in any row, column, or 3x3 block) */
    public boolean isValidSudoku(char[][] board) {

        /** Sets containing numbers already in each row, col, and block. */
        HashSet<Character> rowSet = new HashSet<>(), colSet = new HashSet<>(),
        blockSet = new HashSet<>();

        /** The current element of each row, col, and block being analyzed. */
        char rowElement, colElement, blockElement;

        /** y is the y'th row, column, and block (blocks are analyzed from left to right,
            top to bottom of the board). */
        for (short y = 0; y < 9; y++) {

            /** z is the z'th element of the y'th row, column, or block. (elements are read
                left to right, top to bottom within blocks). */
            for (short z = 0; z < 9; z++) {

                /** Find each respective element */
                rowElement = board[y][z];
                colElement = board[z][y];
                blockElement = board[(3 * (y / 3)) + (z / 3)][(3 * (y % 3)) + (z % 3)];

                /** if the element is not an empty square, add the value to the respective
                    set. If the element is already in the set, return false to the function.
                     */
                if (rowElement != '.' && !rowSet.add(rowElement)) {
                    return false;
                }
                if (colElement != '.' && !colSet.add(colElement)) {
                    return false;
                }
                if (blockElement != '.' && !blockSet.add(blockElement)) {
                    return false;
                }
            }
            /** Clear all the sets, then go to the next row, column, and square. */
            rowSet.clear();
            colSet.clear();
            blockSet.clear();
        }
        /** If no duplicates have been found, return true. */
        return true;
    }
}
