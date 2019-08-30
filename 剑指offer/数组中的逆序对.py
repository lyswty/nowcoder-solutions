# -*- coding:utf-8 -*-
class Solution:
    res = 0
    def merge(self, data, start, mid, end):
        left, right = start, mid
        res = []
        while left < mid and right < end:
            if data[left] > data[right]:
                res.append(data[right])
                Solution.res += mid - left
                Solution.res %= 1000000007
                right += 1
            else:
                res.append(data[left])
                left += 1
        while left < mid:
            res.append(data[left])
            left += 1
        while right < end:
            res.append(data[right])
            right += 1
        for i in range(len(res)):
            data[start + i] = res[i]
    def merge_sort(self, data, start, end):
        if start < end:
            mid = (start + end) // 2
            self.merge_sort(data, start, mid)
            self.merge_sort(data, mid + 1, end)
            self.merge(data, start, mid + 1, end + 1)
    def InversePairs(self, data):
        # write code here
        self.merge_sort(data, 0, len(data) - 1)
        return Solution.res