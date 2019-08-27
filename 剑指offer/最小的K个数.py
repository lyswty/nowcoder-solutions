# -*- coding:utf-8 -*-
class Solution:
    def GetLeastNumbers_Solution(self, tinput, k):
        # write code here
        from Queue import PriorityQueue
        heap = PriorityQueue()
        if not len(tinput) or not k or k > len(tinput):
            return []
        for i in range(k):
            heap.put(-tinput[i])
        for i in range(k, len(tinput)):
            cur = heap.get()
            heap.put(max(cur, -tinput[i]))
        res = []
        while heap.qsize():
            res.append(-heap.get())
        return res[::-1]