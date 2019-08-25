# -*- coding:utf-8 -*-
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
class Solution:
    # 返回合并后列表
    def Merge(self, pHead1, pHead2):
        # write code here
        head = ListNode(-1)
        p = head
        while pHead1 and pHead2:
            if pHead1.val < pHead2.val:
                p.next = ListNode(pHead1.val)
                pHead1 = pHead1.next
            else:
                p.next = ListNode(pHead2.val)
                pHead2 = pHead2.next
            p = p.next
        while pHead1:
            p.next = ListNode(pHead1.val)
            pHead1 = pHead1.next
            p = p.next
        while pHead2:
            p.next = ListNode(pHead2.val)
            pHead2 = pHead2.next
            p = p.next
        head = head.next
        return head