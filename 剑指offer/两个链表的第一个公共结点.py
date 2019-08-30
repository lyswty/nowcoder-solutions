# -*- coding:utf-8 -*-
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    def FindFirstCommonNode(self, pHead1, pHead2):
        # write code here
        len1, len2 = 0, 0
        p1, p2 = pHead1, pHead2
        while p1:
            p1 = p1.next
            len1 += 1
        while p2:
            p2 = p2.next
            len2 += 1
        p1, p2 = pHead1, pHead2
        if len1 - len2 > 0:
            for i in range(len1 - len2):
                p1 = p1.next
        else:
            for i in range(len2 - len1):
                p2 = p2.next
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p1