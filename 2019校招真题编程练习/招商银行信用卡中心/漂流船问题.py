import bisect
people, weight, res, flag = [int(x) for x in input().split()], int(input()), 0, False
people.sort()
is_load = set()
for i in range(len(people)):
    if i in is_load:
        continue
    if flag:
        res += 1
        is_load.add(i)
        continue
    pos = bisect.bisect(people, weight - people[i], i + 1, len(people)) - 1
    while pos in is_load and pos != i:
        pos -= 1
    if pos == i:
        res += 1
        flag = True
        is_load.add(i)
        continue
    is_load.add(i)
    is_load.add(pos)
    res += 1
print(res)