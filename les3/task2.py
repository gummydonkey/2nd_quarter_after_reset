# Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     6
#     -> 5

import random

n = 4#int(input("Сколько чисел будет в массиве: "))
x = 2#int(input("От какого числа отталкиваться: "))

lst = [random.randint(0, 9) for i in range(n)]
print(lst)

result = lst[0]

for i in range(len(lst)):
    if lst[i] == x:
        result = lst[i]
    else:            
        if lst[i]+ == x or lst[i]- == x:
            result = lst[i]
            break
        
                
print(result)
