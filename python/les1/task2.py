# Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. Сколько журавликов сделал каждый ребенок, если известно, что Петя и Сережа 
# сделали одинаковое количество журавликов, а Катя сделала в два раза больше журавликов, чем Петя и Сережа вместе?

# *Пример:*

# 6 -> 1  4  1
# 24 -> 4  16  4
#     60 -> 10  40  10
# ******Рассмотрите вариант, что он также делают журавлики в момент подсчета и известно только число уже полностью готовых

s = int(input())

kate = s / 3 * 2
petr = (s - kate) / 2


print("Петя и Сережа сделали по ",int(petr),"журавля, когда Катя сделала",int(kate),"журавликов.")