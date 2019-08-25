# -*- coding:utf-8 -*-
from bisect import bisect_left
class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        for a in array:
            i = bisect_left(a, target)
            if i != len(a) and a[i] == target:
                return True
        return False