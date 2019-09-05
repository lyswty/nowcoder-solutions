public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        String str1 = String.valueOf(str), str2 = String.valueOf(pattern);
        if (str2.length() == 0){
            if (str1.length() == 0) return true;
            return false;
        }
        if (str2.length() > 1 && pattern[1] == '*'){
            String nextStr2 = str2.substring(2);
            if (match(str1.toCharArray(), nextStr2.toCharArray())) return true;
            if (pattern[0] == '.'){
                for (int i = 1; i <= str1.length(); i++){
                    String nextStr1 = str1.substring(i);
                    if (match(nextStr1.toCharArray(), nextStr2.toCharArray())) return true;
                }
            }
            else{
                for (int i = 1; i <= str1.length() && str[i - 1] == pattern[0]; i++){
                    String nextStr1 = str1.substring(i);
                    if (match(nextStr1.toCharArray(), nextStr2.toCharArray())) return true;
                }
            }
            return false;
        }
        if (str1.length() == 0) return false;
        if (str[0] == pattern[0] || pattern[0] == '.') return match(str1.substring(1).toCharArray(), str2.substring(1).toCharArray());
        return false;
    }
}