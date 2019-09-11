import java.util.Stack;
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
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        Stack<TreeNode> s = new Stack<>();
        if (pRoot == null) return null;
        int cnt = 0;
        while (pRoot != null || s.size() > 0){
            while (pRoot != null){
                s.push(pRoot);
                pRoot = pRoot.left;
            }
            if (s.size() > 0){
                cnt++;
                if (cnt == k) return s.pop();
                pRoot = s.pop();
            }
            pRoot = pRoot.right;
        }
        return null;
    }


}