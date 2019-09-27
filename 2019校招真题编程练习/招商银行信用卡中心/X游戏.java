import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int res = 0;
        for (long i = 1; i <= num; i++) if (isResolution(i)) res++;
        System.out.println(res);
    }
    private static boolean isResolution(long x){
        String xString = String.valueOf(x);
        if ((xString.indexOf('2') != -1 || xString.indexOf('5') != -1 || xString.indexOf('6') != -1 || xString.indexOf('9') != -1) && xString.indexOf('3') == -1 && xString.indexOf('4') == -1 && xString.indexOf('7') == -1) return true;
        return false;
    }
}