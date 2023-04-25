# Работать с файлом california_housing_train.csv, который находится в папке sample_data. 
# Определить среднюю стоимость дома, где кол-во людей от 0 до 500 (population).

# Узнать какая максимальная households в зоне минимального значения population.

# pd.get_dummies(data) # для проверки

data['whoAmI_human'] = data['whoAmI'].map({'human': False, 'robot': True})
data['whoAmI_robot'] = data['whoAmI'].map({'robot': True, 'human': False})
del data['whoAmI']
data

```
  private static void parse2(String s) {
        System.out.println
                (Pattern.compile("\"}?,? ?\\{ ?\"? ?фамилия ?\" ?: ?\" ?")
                        .matcher(Pattern.compile(" ?\\[ ?\\{ ?\" ?фамилия ?\" ?: ?\" ?")
                                .matcher(Pattern.compile(" ?\", ?\"оценка\" ?: ?\" ?")
                                        .matcher(Pattern.compile(" ?\" ?,\" ?предмет\" ?:\" ?")
                                                .matcher(Pattern.compile("\"}]").matcher(s)
                                                        .replaceAll(""))
                                                .replaceAll(" по предмету "))
                                        .replaceAll(" получил "))
                                .replaceAll("Студент "))
                        .replaceAll("\nСтудент "));
    }

    public static String parse1(String s) {
        return (s.replaceAll(" ", "")
                .replaceAll("\\[\\{\"фамилия\":\"", "Студент ")
                .replaceAll("\"\\},\\{\"фамилия\":\"", "\nСтудент ")
                .replaceAll("\",\"оценка\":\"", " получил ")
                .replaceAll("\",\"предмет\":\"", " по предмету ")
                .replaceAll("\"}]", ""));
    }
```


Если кому интересно, то я решил вот так задачу с выводом простых чисел от 1 до 1000:

 System.out.println("Вывод всех простых чисел от 1 до 1000: ");
        int i = 2;
        int j = 2;
        ex3(i, j);
      

        static void ex3(int i, int j){
            // Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
            List<Integer> list = new ArrayList<>();
            for (i = 2; i <= 1000; i++) {
                boolean PrimeNumber = true;
                for (j = 2; j < i; j++) {
                    if (i % j == 0){
                        PrimeNumber = false;
                        break;
                    }
                }
                if(PrimeNumber){
                    list.add(i);
                }
            }
            System.out.println(list);
        }