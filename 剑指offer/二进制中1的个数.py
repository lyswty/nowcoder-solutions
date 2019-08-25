# -*- coding:utf-8 -*-
class Solution:
    def NumberOf1(self, n):
        # write code here
        res = 0
        for i in range(32):
            if n & (1 << i):
                res += 1
        return res