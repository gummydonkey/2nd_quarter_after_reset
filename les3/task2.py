# Требуется найти в массиве A[1..N] самый близкий по величине элемент к заданному числу X. 
# Пользователь в первой строке вводит натуральное число N – количество элементов в массиве. 
# В последующих  строках записаны N целых чисел Ai. Последняя строка содержит число X

# *Пример:*

# 5
#     1 2 3 4 5
#     6
#     -> 5

import random

n = int(input("Сколько чисел будет в массиве: "))
x = int(input("От какого числа отталкиваться: "))

lst = [random.randint(0, 9) for i in range(n)]
print(lst)

result = lst[0]
temp = 1
for i in range(len(lst)):
    if lst[i] == x:
        result = lst[i]
    else:             # гдето я путаюсь и понимаю что не тем путем иду
        if lst[i]+temp == x or lst[i]-temp == x:
            result = lst[i]
        else:   
                temp+=1
                
print(result)