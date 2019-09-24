s = input()
res, i, op = 0, 0, 1
while i < len(s):
    if s[i] == '+':
        op = 1
        i += 1
    elif s[i] == '-':
        op = 0
        i += 1
    else:
        j = i + 1
        while j < len(s) and s[j].isdigit():
            j += 1
        if op:
            res += int(s[i:j])
        else:
            res -= int(s[i:j])
        i = j
print(res)