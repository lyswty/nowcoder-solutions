import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.nextLine());
        int i = 0;
        while (i < sb.length()){
            if (sb.charAt(i) == 'L') for (int j = i - 1; j >= 0 && sb.charAt(j) != 'L'; j--) sb.setCharAt(j, 'L');
            if (sb.charAt(i) == 'R'){
                int j;
                for (j = i + 1; j < sb.length(); j++) if (sb.charAt(j) != '.') break;
                if (j == sb.length() || sb.charAt(j) == 'R'){
                    for (int k = i + 1; k < j; k++) sb.setCharAt(k, 'R');
                    i = j - 1;
                }
                else{
                    int mid = (i + j) / 2;
                    if ((j - i & 1) == 1){
                        for (int k = i + 1; k <= mid; k++) sb.setCharAt(k, 'R');
                        for (int k = mid + 1; k < j; k++) sb.setCharAt(k, 'L');
                    }
                    else{
                        for (int k = i + 1; k < mid; k++) sb.setCharAt(k, 'R');
                        for (int k = mid + 1; k < j; k++) sb.setCharAt(k, 'L');
                    }
                    i = j;
                }
            }
            i++;
        }
        System.out.println(sb);
    }
}