# Винни-Пух попросил Вас посмотреть, есть ли в его стихах ритм.
# Поскольку разобраться в его кричалках не настолько просто, насколько
# легко он их придумывает, Вам стоит написать программу. Винни-Пух
# считает, что ритм есть, если число слогов (т.е. число гласных букв)
# в каждой фразе стихотворения одинаковое. Фраза может состоять из
# одного слова, если во фразе несколько слов, то они разделяются дефисами.
# Фразы отделяются друг от друга пробелами. Стихотворение  Винни-Пух
# вбивает в программу с клавиатуры. В ответе напишите “Парам пам-пам”,
# если с ритмом все в порядке и “Пам парам”, если с ритмом все не в порядке

# *Пример:*

# **Ввод:** пара-ра-рам рам-пам-папам па-ра-па-даa
#     **Вывод:** Парам пам-пам

# lst = data.split()
# print(lst)
# print(lst.find('a'))

# def fnd(string):
#     str.find("а", 0, len(data))


data = 'пара-ра-рам рам-пам-папам па-ра-па-да'
res_lst = []
    


def collect_a(string):
    start = -1
    count = 0
    while True:
        start = string.find("а", start+1)
        if start == -1:
            break
        count += 1
    return count

def sum_a(elem):
    lst = data.split()
    for i in range(0, len(lst)):
        res_lst.append(collect_a(lst[i]))
    print(res_lst)

def flag_founder(res_lst):
    flag = True
    for i in range(1, len(res_lst)):
        if res_lst[0] != res_lst[i]:
            flag = False
    return flag

def comp(flag: bool):
    if flag == False:
        print('Пам парам')
    else:
        print('Парам пам-пам')


sum_a(res_lst)
# flag_founder(res_lst)
comp(flag_founder(res_lst))
    