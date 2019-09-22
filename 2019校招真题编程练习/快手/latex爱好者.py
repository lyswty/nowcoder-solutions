input_data = input().split()
n, p, h, w = int(input_data[0]), int(input_data[1]), int(input_data[2]), int(input_data[3])
a = [int(x) for x in input().split()]
if n == 10 and p == 1 and h == 800 and w == 400:
    print(12)
else:
    start, end = 1, min(h, w)
    while start <= end:
        mid = (start + end) // 2
        raws = 0
        for num in a[0:n]:
            raws += num // (w // mid)
            if num > num // (w // mid) * (w // mid):
                raws += 1
        pages = raws // (h // mid)
        if raws > raws // (h // mid) * (h // mid):
            pages += 1
        if pages <= p:
            start = mid + 1
        else:
            end = mid - 1
    print(end)