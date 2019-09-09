import java.util.*;
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
    String Serialize(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return "#!";
        StringBuilder str = new StringBuilder();
        q.offer(root);
        str.append(String.valueOf(root.val) + '!');
        while (q.size() > 0){
            TreeNode cur = q.poll();
            if (cur.left != null){
                str.append(String.valueOf(cur.left.val) + '!');
                q.offer(cur.left);
            }
            else if (cur.right != null || q.size() > 0) str.append("#!");
            if (cur.right != null){
                str.append(String.valueOf(cur.right.val) + '!');
                q.offer(cur.right);
            }
            else if (q.size() > 0) str.append("#!");
        }
        return str.toString();
    }
    TreeNode Deserialize(String str) {
        if (str.equals("#!")) return null;
        Queue<TreeNode> q = new LinkedList<>();
        String[] data = str.split("!");
        TreeNode root = new TreeNode(new Integer(data[0]));
        q.offer(root);
        for (int i = 1; i < data.length; i++){
            TreeNode cur = q.poll();
            if (!data[i].equals("#")) {
                cur.left = new TreeNode(new Integer(data[i]));
                q.offer(cur.left);
            }
            if (++i == data.length) break;
            if (!data[i].equals("#")) {
                cur.right = new TreeNode(new Integer(data[i]));
                q.offer(cur.right);
            }
        }
        return root;
    }
}