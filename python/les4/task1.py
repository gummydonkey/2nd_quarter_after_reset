# Даны два неупорядоченных набора целых чисел (может быть, с повторениями). Выдать без 
# повторений в порядке возрастания все те числа, которые встречаются в 
# обоих наборах.
# Пользователь вводит 2 числа. n - кол-во элементов первого множества. m - кол-во 
# элементов второго множества. Затем пользователь вводит сами элементы множеств.

n = int(input('Сколько элементов будет в 1 списке: '))
print('Введите элементы списка')
lst1 = list()

for i in range(n):
    if i < n:
        lst1.append(int(input()))


m = int(input('Сколько элементов будет во 2 списке: '))
print('Введите элементы списка')
lst2 = list()

for i in range(m):
    if i < m:
        lst2.append(int(input()))
print(lst1, '<= 1 список: ')
print(lst2, '<= 2 список: ')

set_inter = set(lst1).intersection(set(lst2))
print(set_inter, '<= объединение списков в множество без дублей: ')

list_inter = list(set_inter)
list_inter.sort()
print(list_inter, ' <= отсортированный список')

