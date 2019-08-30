# -*- coding:utf-8 -*-
import bisect
class Solution:
    def GetNumberOfK(self, data, k):
        # write code here
        return bisect.bisect_right(data, k) - bisect.bisect_left(data, k)