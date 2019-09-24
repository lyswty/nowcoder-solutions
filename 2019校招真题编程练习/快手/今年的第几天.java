import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
        int[] dayOfEachMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        for (int i = 1; i < m; i++) d += dayOfEachMonth[i];
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) d++;
        System.out.println(d);
    }
}