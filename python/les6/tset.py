# def sum_dividers(n):
#     return sum(x for x in range(1, n//2+1) if not n % x)


# k = int(input('input k: '))

# for i in range(1, k+1):
#     potentially_friendly = sum_dividers(i)
#     if i < potentially_friendly and i == sum_dividers(potentially_friendly):
#         print(i, potentially_friendly)


def quick_sort(array):
    if len(array) <= 1:
        return array
    else:
        pivot = array[0]
    less = [i for i in array[1:] if i <= pivot]
    greater = [i for i in array[1:] if i > pivot]
    return quick_sort(less) + [pivot] + quick_sort(greater)

print(quick_sort([10, 2, 15, 22]))