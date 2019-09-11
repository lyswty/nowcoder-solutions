public class Solution {
    private boolean[] vis; 
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        vis = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++){
            if (dfs(matrix, rows, cols, i, j, str, 0)) return true;
            vis[i * cols + j] = false;
        }
        return false;
    }
    private boolean dfs(char[] matrix, int rows, int cols, int row, int col, char[] str, int index){
        int i = row * cols + col;
        vis[i] = true;
        if (matrix[i] != str[index]) return false;
        if (index + 1 == str.length) return true;
        if (row > 0 && !vis[(row - 1) * cols + col]){
            if (dfs(matrix, rows, cols, row - 1, col, str, index + 1)) return true;
            vis[(row - 1) * cols + col] = false;
        }
        if (row + 1 < rows && !vis[(row + 1) * cols + col]){
            if (dfs(matrix, rows, cols, row + 1, col, str, index + 1)) return true;
            vis[(row + 1) * cols + col] = false;
        }
        if (col > 0 && !vis[row * cols + col - 1]){
            if (dfs(matrix, rows, cols, row, col - 1, str, index + 1)) return true;
            vis[row * cols + col - 1] = false;
        }
        if (col + 1 < cols && !vis[row * cols + col + 1]){
            if (dfs(matrix, rows, cols, row, col + 1, str, index + 1)) return true;
            vis[row * cols + col + 1] = false;
        }
        return false;
    }

}