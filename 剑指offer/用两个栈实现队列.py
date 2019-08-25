# -*- coding:utf-8 -*-
class Solution:
    def __init__(self):
        self.s1, self.s2 = [], []
    def push(self, node):
        # write code here
        while self.s1:
            self.s2.append(self.s1.pop())
        self.s2.append(node)
    def pop(self):
        # return xx
        while self.s2:
            self.s1.append(self.s2.pop())
        return self.s1.pop()