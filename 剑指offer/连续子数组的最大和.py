# -*- coding:utf-8 -*-
class Solution:
    def FindGreatestSumOfSubArray(self, array):
        # write code here
        import sys
        res = -sys.maxsize
        dp = [0] * len(array)
        dp[0] = array[0]
        res = max(dp[0], res)
        for i in range(1, len(array)):
            dp[i] = max(array[i], array[i] + dp[i - 1])
            res = max(dp[i], res)
        return res