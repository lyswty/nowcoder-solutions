# -*- coding:utf-8 -*-
class Solution:
    def FindContinuousSequence(self, tsum):
        # write code here
        if tsum < 3:
            return []
        nums = [i for i in range(1, (tsum + 1) // 2 + 1)]
        res = []
        for i in range(len(nums)):
            start, end = i, len(nums) - 1
            while start < end:
                mid = (start + end) // 2
                if (nums[mid] - nums[i] + 1) * (nums[mid] + nums[i]) < 2 * tsum:
                    start = mid + 1
                else:
                    end = mid
            if (nums[start] - nums[i] + 1) * (nums[start] + nums[i]) == 2 * tsum:
                cur = []
                for j in range(i, start + 1):
                    cur.append(nums[j])
                res.append(cur)
        return res