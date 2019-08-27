# -*- coding:utf-8 -*-
class Solution:
    def NumberOf1Between1AndN_Solution(self, n):
        # write code here
        n_str = str(n)
        res = 0
        for i in range(len(n_str)):
            last = int(n_str[:i]) if i else 0
            post = int(n_str[i + 1:]) if i < len(n_str) - 1 else 0
            if n_str[i] == '0':
                res += last * 10 ** (len(n_str) - i - 1)
            elif n_str[i] == '1':
                res += last * 10 ** (len(n_str) - i - 1)
                res += post + 1
            else:
                res += (last + 1) * 10 ** (len(n_str) - i - 1)
        return res