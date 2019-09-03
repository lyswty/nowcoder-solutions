public class Solution {
    public int StrToInt(String str) {
        if ("-2147483648".equals(str)) return -2147483648;
        if (str.length() == 0) return 0;
        boolean negative = false;
        if (str.charAt(0) == '-') negative = true;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') str = str.substring(1);
        int res = 0;
        for (int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))) return 0;
            res += Math.pow(10, str.length() - i - 1) * (str.charAt(i) - '0');
        }
        if (negative) return -res;
        return res;
    }
}