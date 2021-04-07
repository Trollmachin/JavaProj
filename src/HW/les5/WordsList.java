package HW.les5;
/*
Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран. Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordsList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        List<String> listProcessing = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if (s.length() % 2 == 0) {
                listProcessing.add(s + " " + s);
            } else listProcessing.add(s + " " + s + " " + s);
        }

        for (int i = 0; i < listProcessing.size(); i++) {
            System.out.println(listProcessing.get(i));
        }

    }
}
