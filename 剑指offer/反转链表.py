# -*- coding:utf-8 -*-
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    # 返回ListNode
    def ReverseList(self, pHead):
        # write code here
        if not pHead:
            return pHead
        last, cur = None, pHead
        while cur:
            ptr = cur.next
            cur.next = last
            last, cur = cur, ptr
        return last