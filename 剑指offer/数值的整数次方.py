# -*- coding:utf-8 -*-
class Solution:
    def Power(self, base, exponent):
        # write code here
        if not exponent:
            return 1
        if abs(base) < 1e-8:
            return 0
        negative = False
        if exponent < 0:
            negative = True
            exponent = -exponent
        res = 1.0
        for i in range(exponent):
            res *= base
        if negative:
            res = 1 / res
        return res