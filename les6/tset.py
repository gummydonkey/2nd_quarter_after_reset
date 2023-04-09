def sum_dividers(n):
    return sum(x for x in range(1, n//2+1) if not n % x)


k = int(input('input k: '))

for i in range(1, k+1):
    potentially_friendly = sum_dividers(i)
    if i < potentially_friendly and i == sum_dividers(potentially_friendly):
        print(i, potentially_friendly)
