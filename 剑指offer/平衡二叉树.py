# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    memory = {}
    def get_height(self, root):
        if root in Solution.memory:
            return Solution.memory[root]
        if not root:
            Solution.memory[root] = 0
            return 0
        Solution.memory[root] = max(self.get_height(root.left), self.get_height(root.right)) + 1
        return Solution.memory[root]
    def IsBalanced_Solution(self, pRoot):
        # write code here
        if not pRoot:
            return True
        if abs(self.get_height(pRoot.left) - self.get_height(pRoot.right)) > 1:
            return False
        return self.IsBalanced_Solution(pRoot.left) and self.IsBalanced_Solution(pRoot.right)