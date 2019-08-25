# -*- coding:utf-8 -*-
class Solution:
    def Fibonacci(self, n):
        if n == 1:
            return 1
        if n == 0:
            return 0
        last, cur = 0, 1
        for i in range(2, n + 1):
            last, cur = cur, last + cur
        return cur
        # write code here