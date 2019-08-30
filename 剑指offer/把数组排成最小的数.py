# -*- coding:utf-8 -*-
class Solution:
    def PrintMinNumber(self, numbers):
        # write code here
        if not len(numbers):
            return ""
        def cmp1(a, b):
            A, B = str(a), str(b)
            return -1 if A + B < B + A else 1
        numbers.sort(cmp=cmp1)
        res = ""
        for num in numbers:
            res += str(num)
        return int(res)