import java.util.*;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0) return -1;
        int i = -1, res = -1;
        Set<Integer> vis = new HashSet<>();
        while (vis.size() < n){
            for (int j = 0; j < m; j++){
                do{
                    i++;
                    if (i == n) i = 0;
                } while (vis.contains(i));
            }
            vis.add(i);
            res = i;
        }
        return res;
    }
}