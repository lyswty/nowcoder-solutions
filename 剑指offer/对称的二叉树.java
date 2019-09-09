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
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot == null) return true;
        return isMirrorTree(pRoot.left, pRoot.right);
    }
    boolean isMirrorTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 != null && root2 == null || root1 ==null && root2 != null) return false;
        if (root1.val != root2.val) return false;
        return isMirrorTree(root1.left, root2.right) && isMirrorTree(root1.right, root2.left);
    }
}