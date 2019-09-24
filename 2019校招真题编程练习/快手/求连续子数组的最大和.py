nums = [int(num) for num in input().split(',')]
sum, res = 0, 0
for x in nums:
    if x < 0:
        res = max(res, sum)
    sum += x
    if sum < 0:
        sum = 0
res = max(res, sum)
print(res)