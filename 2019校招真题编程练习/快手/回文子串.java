import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for (int l = 0; l < s.length(); l++) for (int i = 0; i + l < s.length(); i++){
            if (l == 0) dp[i][i + l] = true;
            else if (l == 1) dp[i][i + l] = s.charAt(i) == s.charAt(i + l);
            else if (dp[i + 1][i + l - 1]) dp[i][i + l] = s.charAt(i) == s.charAt(i + l);
            if (dp[i][i + l]) res++;
        }
        System.out.println(res);
    }
}