# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    def Convert(self, pRootOfTree):
        # write code here
        from Queue import LifoQueue
        s = LifoQueue()
        if not pRootOfTree:
            return None
        p = pRootOfTree
        last = None
        while s.qsize() or p:
            while p:
                s.put(p)
                p = p.left
            p = s.get()
            if last:
                last.right = p
                p.left = last
            else:
                pRootOfTree = p
                p.left = last
            last = p
            p = p.right
        last.right = None
        return pRootOfTree