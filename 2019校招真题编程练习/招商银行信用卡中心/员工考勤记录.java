import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0;
        res += n + 1 + n * (n - 1) / 2;
        System.out.println(res);
    }
}