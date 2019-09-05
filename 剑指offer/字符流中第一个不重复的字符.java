import java.util.*;
public class Solution {
    //Insert one char from stringstream
    Queue<Character> q = new LinkedList<Character>();
    HashMap<Character, Integer> fre = new HashMap<>();
    public void Insert(char ch)
    {
        if (fre.containsKey(ch)) fre.put(ch, fre.get(ch) + 1);
        else{
            fre.put(ch, 1);
            q.offer(ch);
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while (q.peek() != null){
            if (fre.get(q.peek()) == 1) return q.peek();
            else q.poll();
        }
        return '#';
    }
}