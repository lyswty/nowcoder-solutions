/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
*/
import java.util.HashMap;
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        HashMap<Integer, Integer> fre = new HashMap<>();
        for (ListNode p = pHead; p != null; p = p.next){
            if (fre.containsKey(p.val)) fre.put(p.val, fre.get(p.val) + 1);
            else fre.put(p.val, 1);
        }
        ListNode last = null, cur = pHead;
        while (cur != null){
            if (fre.get(cur.val) > 1){
                if (last == null){
                    cur = cur.next;
                    pHead = cur;
                }
                else {
                    last.next = cur.next;
                    cur = cur.next;
                }
            }
            else {
                last = cur;
                cur = cur.next;
            }
        }
        return pHead;
    }
}