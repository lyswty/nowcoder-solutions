import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), r = sc.nextInt();
        System.out.println(r - l + 1 - (r + 2) / 3 + (l + 1) / 3);
    }
}