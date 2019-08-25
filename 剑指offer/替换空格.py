# -*- coding:utf-8 -*-
class Solution:
    # s 源字符串
    def replaceSpace(self, s):
        # write code here
        reslist = s.split(" ")
        if not reslist:
            return ""
        res = reslist[0]
        for i in range(1, len(reslist)):
            res += "%%20%s" % reslist[i]
        return res