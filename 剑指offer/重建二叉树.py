# -*- coding:utf-8 -*-
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    # 返回构造的TreeNode根节点
    def reConstructBinaryTree(self, pre, tin):
        # write code here
        def reconstruct(prestart, preend, instart, inend):
            if prestart > preend:
                return None
            root = TreeNode(pre[prestart])
            for inroot in range(instart, inend + 1):
                if tin[inroot] == pre[prestart]:
                    break
            inleftstart, inleftend, inrightstart, inrightend = instart, inroot - 1, inroot + 1, inend
            preleftstart, preleftend, prerightstart, prerightend = prestart + 1, prestart + 1 + inleftend - inleftstart, prestart + 2 + inleftend - inleftstart, preend
            root.left = reconstruct(preleftstart, preleftend, inleftstart, inleftend)
            root.right = reconstruct(prerightstart, prerightend, inrightstart, inrightend)
            return root
        return reconstruct(0, len(pre) - 1, 0, len(tin) - 1)