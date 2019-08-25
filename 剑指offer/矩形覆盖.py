# -*- coding:utf-8 -*-
class Solution:
    def rectCover(self, number):
        # write code here
        if number == 0:
            return 0
        if number == 1:
            return 1
        last, cur = 1, 2
        for i in range(3, number + 1):
            last, cur = cur, last + cur
        return cur