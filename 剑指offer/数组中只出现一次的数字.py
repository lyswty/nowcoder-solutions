# -*- coding:utf-8 -*-
class Solution:
    # 返回[a,b] 其中ab是出现一次的两个数字
    def FindNumsAppearOnce(self, array):
        # write code here
        op = 0
        for i in array:
            op ^= i
        res, array1, array2 = [], [], []
        i = 0
        while not (op >> i) & 1:
            i += 1
        for num in array:
            if (num >> i) & 1:
                array1.append(num)
            else:
                array2.append(num)
        op = 0
        for i in array1:
            op ^= i
        res.append(op)
        op = 0
        for i in array2:
            op ^= i
        res.append(op)
        return res