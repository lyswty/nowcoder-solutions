/*
 public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
 
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead, fast = pHead;
        if (fast == null || fast.next == null) return null;
        do{
            fast = fast.next.next;
            slow = slow.next;
        } while (fast != null && fast.next != null && fast != slow);
        slow = pHead;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}