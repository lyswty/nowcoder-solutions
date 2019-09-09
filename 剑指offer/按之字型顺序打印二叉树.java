import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 
    public TreeNode(int val) {
        this.val = val;
 
    }
 
}
*/
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        if (pRoot == null) return new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(pRoot);
        ArrayList<Integer> cur = new ArrayList<>();
        int direct = 1;
        TreeNode last = pRoot, l = last;
        while(q.peek() != null){
            TreeNode curNode = q.poll();
            if (direct == 1) cur.add(curNode.val);
            else cur.add(0, curNode.val);
            if (curNode.left != null){
                q.offer(curNode.left);
                l = curNode.left;
            }
            if (curNode.right != null){
                q.offer(curNode.right);
                l = curNode.right;
            }
            if (curNode == last){
                last = l;
                res.add(new ArrayList<>(cur));
                cur.clear();
                direct = -direct;
            }
        }
        return res;
    }
}