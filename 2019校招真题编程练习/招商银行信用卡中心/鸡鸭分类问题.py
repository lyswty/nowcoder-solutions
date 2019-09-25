s = input()
left, right, left_res, right_res = 0, len(s) - 1, 0, 0
while left < len(s) and s[left] == 'D':
    left += 1
for i in range(left, len(s)):
    if s[i] == 'D':
        left_res += i - left
        left += 1
while right >= 0 and s[right] == 'D':
    right -= 1
for i in range(right, -1, -1):
    if s[i] == 'D':
        right_res += right - i
        right -= 1
print(min(left_res, right_res))