import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] dp = new int[x + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int v = 3; v <= x; v++){
            if (dp[v - 3] != -1) dp[v] = dp[v - 3] + 1;
            if (v >= 5 && dp[v - 5] != -1 && (dp[v] == -1 || dp[v] > dp[v - 5] + 1)) dp[v] = dp[v - 5] + 1;
            if (v >= 7 && dp[v - 7] != -1 && (dp[v] == -1 || dp[v] > dp[v - 7] + 1)) dp[v] = dp[v - 7] + 1;
        }
        System.out.println(dp[x]);
    }
}