price = [int(x) for x in input().split()]
min_price, res = price[0], 0
for p in price:
    if p - min_price > 0:
        res = max(res, p - min_price)
    else:
        min_price = p
print(res)