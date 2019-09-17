import bisect, sys
n = int(input())
apples = [int(x) for x in sys.stdin.readline().split()]
m = int(input())
for i in range (1, n):
    apples[i] += apples[i - 1]
querys = [int(x) for x in sys.stdin.readline().split()]
for x in querys:
    print(bisect.bisect_left(apples, x) + 1)