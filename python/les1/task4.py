# Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по прямой между дольками
# (то есть разломить шоколадку на два прямоугольника).

# *Пример:*

# 3 2 4 -> yes
# 3 2 1 -> no

n = int(input("что по ширине шоколадки?  "))

m = int(input("а по длинне?  "))

k = int(input("сколько ломать будем?  "))

if k // m != 0 or k // n != 0:
    print("ломай ее полностью")
else: 
    print("не твой день")

    #### Почему с НЕ РАВНО работает хотя вроде бы логично что количество отломанных должно делиться без остатка на одну из сторон