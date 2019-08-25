# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    # 返回从上到下每个节点值列表，例：[1,2,3]
    def PrintFromTopToBottom(self, root):
        # write code here
        from Queue import Queue
        q = Queue()
        res = []
        if not root:
            return res
        q.put(root)
        while q.qsize():
            cur = q.get()
            res.append(cur.val)
            if cur.left:
                q.put(cur.left)
            if cur.right:
                q.put(cur.right)
        return res