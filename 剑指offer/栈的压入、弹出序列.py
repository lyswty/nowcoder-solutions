# -*- coding:utf-8 -*-
class Solution:
    def IsPopOrder(self, pushV, popV):
        # write code here
        i, j = 0, 0
        stack = []
        while j < len(popV):
            while not len(stack) or stack[len(stack) - 1] != popV[j]:
                if i == len(pushV):
                    return False
                stack.append(pushV[i])
                i += 1
            stack.pop()
            j += 1
        return j == len(popV)