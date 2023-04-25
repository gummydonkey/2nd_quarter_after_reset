# На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом. Определите минимальное число монеток, 
# которые нужно перевернуть, чтобы все монетки были повернуты вверх одной и той же стороной. 
# Выведите минимальное количество монет, которые нужно перевернуть

import random 

coins = int(5)

lst = [random.randint(0, 1) for i in range(coins)]

sum_zero = 0
sum_one = 0
length_lst = len(lst) 

print(lst)
for i in range(length_lst):
    sum_one = lst[i] + sum_one

if coins - sum_one < sum_one:
    print(coins - sum_one)
else:
    print(sum_one)

# да не самое легкое решение, иду по лекциям