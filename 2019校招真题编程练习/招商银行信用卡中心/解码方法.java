import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() == 0 || s.charAt(0) == '0') System.out.println(0);
        else if (s.length() == 1) System.out.println(1);
        else{
            int[] dp = new int[s.length()];
            dp[0] = 1;
            if (Integer.parseInt(s.substring(0, 2)) <= 26) dp[1] = 1;
            if (s.charAt(1) != '0') dp[1] += dp[0];
            for (int i = 2; i < s.length(); i++){
                dp[i] = 0;
                if (s.charAt(i) != '0') dp[i] += dp[i - 1];
                if (Integer.parseInt(s.substring(i - 1, i + 1)) <= 26) dp[i] += dp[i - 2];
            }
            System.out.println(dp[s.length() - 1]);
        }
    }
}