# -*- coding:utf-8 -*-
import sys
class Solution:
    def FirstNotRepeatingChar(self, s):
        # write code here
        char_pos, is_only_one = {}, {}
        for i in range(len(s)):
            if s[i] in is_only_one:
                is_only_one[s[i]] = False
            else:
                is_only_one[s[i]] = True
                char_pos[s[i]] = i
        res = sys.maxsize
        for k, v in is_only_one.items():
            if v:
                res = min(res, char_pos[k])
        return res if res < sys.maxsize else -1