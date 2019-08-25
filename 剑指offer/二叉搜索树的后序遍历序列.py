# -*- coding:utf-8 -*-
class Solution:
    def judge(self, sequence, start, end):
        if start >= end:
            return True
        rightstart = end - 1
        while rightstart >= start and sequence[rightstart] > sequence[end]:
            rightstart -= 1
        rightstart += 1
        for i in range(start, rightstart):
            if sequence[i] >= sequence[end]:
                return False
        return self.judge(sequence, start, rightstart - 1) and self.judge(sequence, rightstart, end - 1)
    def VerifySquenceOfBST(self, sequence):
        # write code here
        if not sequence:
            return False
        return self.judge(sequence, 0, len(sequence) - 1)