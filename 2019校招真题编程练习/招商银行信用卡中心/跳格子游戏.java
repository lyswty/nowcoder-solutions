import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), last = 2, res = 3;
        if (n == 1) res = 1;
        else if (n == 2) res = 2;
        else for (int i = 3; i < n; i++){
            int cur = last + res;
            last = res;
            res = cur;
        }
        System.out.println(res);
    }
}