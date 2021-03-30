package HW.les3;
/*
Создать список чисел и заполнить его с консоли
Разбить список на два других: - в первый список сохранять чётные числа - во второй список сохранять нечётные числа
Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int i = Integer.parseInt(s);
            list.add(i);
        }
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0) {
                even.add(x);
            } else {
                odd.add(x);
            }

        }
        System.out.println(list);
        System.out.println(even);
        System.out.println(odd);
    }
}
