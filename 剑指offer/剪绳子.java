public class Solution {
    public int cutRope(int target) {
        if (target == 2) return 1;
        if (target == 3) return 2;
        if (target % 3 == 1) return (int)Math.pow(3, target / 3 - 1) * 4;
        else if (target % 3 == 2) return (int)Math.pow(3, target / 3) * 2;
        else return (int)Math.pow(3, target / 3);
    }
}