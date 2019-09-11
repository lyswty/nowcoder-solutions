import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    private class Axis {
        private int row, col;
        public Axis(int row, int col){
            this.row = row;
            this.col = col;
        }
        public int getRow(){
            return row;
        }
        public int getCol(){
            return col;
        }
        public void setRow(int row){
            this.row = row;
        }
        public void setCol(int col){
            this.col = col;
        }
    }
    private int sum(int x, int y){
        int res = 0;
        while (x > 0){
            res += x % 10;
            x /= 10;
        }
        while (y > 0){
            res += y % 10;
            y /= 10;
        }
        return res;
    }
    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold < 0) return 0;
        boolean[][] visited = new boolean[rows][cols];
        Queue<Axis> current = new LinkedList<>();
        Axis start = new Axis(0, 0);
        current.offer(start);
        visited[0][0] = true;
        int res = 1;
        while (current.size() > 0){
            Axis cur = current.poll();
            if (cur.getRow() > 0){
                Axis curUp = new Axis(cur.getRow() - 1, cur.getCol());
                if (!visited[curUp.getRow()][curUp.getCol()] && sum(curUp.getRow(), curUp.getCol()) <= threshold){
                    visited[curUp.getRow()][curUp.getCol()] = true;
                    current.offer(curUp);
                    res++;
                }
            }
            if (cur.getRow() + 1 < rows){
                Axis curDown = new Axis(cur.getRow() + 1, cur.getCol());
                if (!visited[curDown.getRow()][curDown.getCol()] && sum(curDown.getRow(), curDown.getCol()) <= threshold){
                    visited[curDown.getRow()][curDown.getCol()] = true;
                    current.offer(curDown);
                    res++;
                }
            }
            if (cur.getCol() > 0){
                Axis curLeft = new Axis(cur.getRow(), cur.getCol() - 1);
                if (!visited[curLeft.getRow()][curLeft.getCol()] && sum(curLeft.getRow(), curLeft.getCol()) <= threshold){
                    visited[curLeft.getRow()][curLeft.getCol()] = true;
                    current.offer(curLeft);
                    res++;
                }
            }
            if (cur.getCol() + 1 < cols){
                Axis curRight = new Axis(cur.getRow(), cur.getCol() + 1);
                if (!visited[curRight.getRow()][curRight.getCol()] && sum(curRight.getRow(), curRight.getCol()) <= threshold){
                    visited[curRight.getRow()][curRight.getCol()] = true;
                    current.offer(curRight);
                    res++;
                }
            }
        }
        return res;
    }
}