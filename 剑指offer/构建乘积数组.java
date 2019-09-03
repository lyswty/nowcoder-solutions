import java.util.Arrays;
public class Solution {
    public int[] multiply(int[] A) {
        int[] res = new int[A.length];
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < A.length; i++){
            left[i] = left[i - 1] * A[i - 1];
            right[A.length - 1 - i] = right[A.length - i] * A[A.length - i];
        }
        for (int i = 0; i < A.length; i++) res[i] = left[i] * right[i];
        return res;
    }
}