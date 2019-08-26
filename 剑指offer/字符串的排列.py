# -*- coding:utf-8 -*-
class Solution:
    def helper(self, ss, res, begin):
        if begin + 1 == len(ss):
            if ss not in res:
                res.append(ss)
        else:
            for i in range(begin, len(ss)):
                next_ss = ss
                if i != begin:
                    next_ss = ss[:begin] + ss[i] + ss[begin + 1:i] + ss[begin] + ss[i + 1:]
                self.helper(next_ss, res, begin + 1)
    def Permutation(self, ss):
        # write code here
        res = []
        if not ss:
            return res
        self.helper(ss, res, 0)
        res.sort()
        return res