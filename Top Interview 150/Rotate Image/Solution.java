class Solution {
    public void rotate(int[][] matrix) {

        rotateHelper(matrix, 0);
        
    }

    public void rotateHelper(int[][] matrix, int ring) {

        final int startBound = ring, endBound = matrix.length - ring - 1;
        final int size = matrix.length - (2 * ring);

        if (size <= 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {

            int temp = matrix[startBound][startBound + i];
            matrix[startBound][startBound + i] = matrix[endBound - i][startBound];
            matrix[endBound - i][startBound] = matrix[endBound][endBound - i];
            matrix[endBound][endBound - i] = matrix[startBound + i][endBound];
            matrix[startBound + i][endBound] = temp;

        }
        rotateHelper(matrix, ring + 1);
    }
}
