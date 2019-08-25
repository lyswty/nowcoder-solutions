# -*- coding:utf-8 -*-
class Solution:
    def minNumberInRotateArray(self, rotateArray):
        # write code here
        if not rotateArray:
            return 0
        left, right = 0, len(rotateArray) - 1
        while left < right:
            mid = (left + right) // 2
            if rotateArray[mid] < rotateArray[right]:
                right = mid
            elif rotateArray[mid] > rotateArray[right]:
                left = mid + 1
            else:
                controller = 1
                for i in range(left, mid + 1):
                    if rotateArray[left] != rotateArray[i]:
                        controller = 0
                        break
                if controller:
                    left = mid + 1
                else:
                    right = mid
        return rotateArray[left]