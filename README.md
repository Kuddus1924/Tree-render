## Задание 


Написать консольное приложение `Tree-render`:

1. Приложение должно принимать на вход два параметра `java Tree-render INPUT_FILE_NAME OUTPUT_FILE_NAME`. 
2. Читать текстовый файл `INPUT_FILE_NAME`. В файле содержится текстовое определение дерева, в качестве узлов натуральные числа. Анализ формата записи выполнить самостоятельно по приведеному примеру:

```txt
(1 (2 (4 5 6 (7))(10))(3))
```

3. Результатом выполнения программы должен быть файл записанный по пути `OUTPUT_FILE_NAME`. Файл должен содержать псевдо-графическую текстовую визуализацию дерева. Пример вывода для ввода приведенного выше:

```txt
1
    2
        4
        5
        6
            7
        10
    3
