# -*- coding:utf-8 -*-
class Solution:
    def GetUglyNumber_Solution(self, index):
        # write code here
        if not index:
            return 0
        index_2, index_3, index_5 = 0, 0, 0
        res_list = [1]
        while len(res_list) < index:
            next_2, next_3, next_5 = res_list[index_2] * 2, res_list[index_3] * 3, res_list[index_5] * 5
            next_ugly_number = min(next_2, next_3, next_5)
            if next_ugly_number not in res_list:
                res_list.append(next_ugly_number)
            if next_ugly_number == next_2:
                index_2 += 1
            elif next_ugly_number == next_3:
                index_3 += 1
            else:
                index_5 += 1
        return res_list[len(res_list) - 1]