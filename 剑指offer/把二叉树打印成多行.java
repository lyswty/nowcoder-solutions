import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
 
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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(pRoot);
        ArrayList<Integer> curList = new ArrayList<>();
        TreeNode last = pRoot, l = last;
        while(q.size() > 0){
            TreeNode curNode = q.poll();
            curList.add(curNode.val);
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
                res.add(new ArrayList<Integer>(curList));
                curList.clear();
            }
        }
        return res;
    }
}