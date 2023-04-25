import os

def main() -> None:

    print('Программа запущена...')
    data = load_from_file()

    command = menu()
    if command == 1:
        pass#show_on_screen(data)
    # elif command == 2:
    #     find_contact(data) 
    elif command == 3:
        new_contact(data)
        print(type(data))


def menu():

    commands = [
    'Показать все контакты',
    'Найти контакт',
    'Создать контакт'
]
    print('Укажите номер команды:')
    print('\n'.join(f'{n}. {v}' for n, v in enumerate(commands, 1)))
    choice = input('>>> ')

    try:
        choice = int(choice)
        if choice < 0 or len(commands) < choice:
            raise Exception('Такой команды пока нет ;(')
            #choice -= 1
    except ValueError as ex:
        print('Я вас не понял, повторите...')
        menu()
    except Exception as ex:
        print(ex)
        menu()
    else:
        return choice
 
def file_path(file_name='contact_list'):
    return os.path.join(os.path.dirname(__file__), f'{file_name}.txt')   
def load_from_file():
    path = file_path()
    with open(path, 'a+', encoding='UTF-8') as file:
        data = file.read()
    return data    
    
def new_contact(contacts: list) -> None:
    # Контактной информации может быть больше чем только телефон
    contacts.rjust(
    dict(
        first_name=input('Введите имя контакта:\n>>> '),
        second_name=input('Введите фамилию контакта:\n>>> '),
        contacts=input('Введите номер телефона:\n>>> ')
    )
)
    print(type(contacts))
    


if __name__ == '__main__':
    main()