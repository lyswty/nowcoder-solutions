# -*- coding:utf-8 -*-
class Solution:
    # matrix类型为二维列表，需要返回列表
    def printMatrix(self, matrix):
        # write code here
        res = []
        if not len(matrix) or not len(matrix[0]):
            return res
        left, right, top, bottom = 0, len(matrix[0]) - 1, 0, len(matrix) - 1
        while top <= bottom and left <= right:
            for i in range(left, right):
                res.append(matrix[top][i])
            if top == bottom:
                res.append(matrix[top][right])
                break
            for i in range(top, bottom):
                res.append(matrix[i][right])
            if left == right:
                res.append(matrix[bottom][right])
                break
            for i in range(right, left, -1):
                res.append(matrix[bottom][i])
            for i in range(bottom, top, -1):
                res.append(matrix[i][left])
            top += 1
            left += 1
            bottom -= 1
            right -= 1
        return res