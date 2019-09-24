import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = 0;
        String input = sc.nextLine();
        String[] words = input.substring(1, input.length() - 1).split(",");
        if (words[0].equals("")){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < words.length; i++) words[i] = words[i].substring(1, words[i].length() - 1);
        for (int i = 0; i < words.length; i++) for (int j = i + 1; j < words.length; j++) if (noDuplicate(words[i], words[j])) res = Math.max(res, words[i].length() * words[j].length());
        System.out.println(res);
    }
    private static boolean noDuplicate(String s1, String s2){
        HashSet<Character> charInS1 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) charInS1.add(s1.charAt(i));
        for (int i = 0; i < s2.length(); i++) if (charInS1.contains(s2.charAt(i))) return false;
        return true;
    }
}