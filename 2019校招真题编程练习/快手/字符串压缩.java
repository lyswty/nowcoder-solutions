import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < s.length()){
            int j = i + 1;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            sb.append(String.valueOf(j - i));
            sb.append(s.charAt(i));
            i = j;
        }
        System.out.println(sb.toString());
    }
}