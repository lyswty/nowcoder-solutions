import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(a / b);
        a %= b;
        if (a != 0){
            System.out.print('.');
            HashMap<Integer, Integer> remainIndex = new HashMap<>();
            StringBuffer decimal = new StringBuffer();
            while (a != 0){
                remainIndex.put(a, decimal.length());
                a *= 10;
                decimal.append(String.valueOf(a / b));
                a %= b;
                if (remainIndex.containsKey(a)){
                    decimal.insert(remainIndex.get(a), "(");
                    decimal.append(')');
                    break;
                }
            }
            System.out.print(decimal);
        }
    }
}