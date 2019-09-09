/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;
 
    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if (pNode.right != null) {
            TreeLinkNode p = pNode.right;
            while (p.left != null) p = p.left;
            return p;
        }
        else {
            TreeLinkNode p = pNode;
            while (p.next != null && p.next.left != p) p = p.next;
            return p.next;
        }
    }
}