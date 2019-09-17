nums = input().split()
a, b, c = int(nums[0]), int(nums[1]), int(nums[2])
print(max(a + b + c, a + b * c, a * b + c, a * b * c, (a + b) * c, a * (b + c)))