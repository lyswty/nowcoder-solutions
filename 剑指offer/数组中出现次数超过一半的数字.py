# -*- coding:utf-8 -*-
class Solution:
    def MoreThanHalfNum_Solution(self, numbers):
        # write code here
        frequency = {}
        for i in numbers:
            frequency.setdefault(i, 0)
            frequency[i] += 1
            if frequency[i] > len(numbers) // 2:
                return i
        return 0