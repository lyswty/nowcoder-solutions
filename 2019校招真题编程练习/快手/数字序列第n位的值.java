import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), left = 1, right = n;
        while (left <= right){
            int mid = (left + right) / 2;
            if ((mid + 1) * mid / 2 < n) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println(left);
    }
}