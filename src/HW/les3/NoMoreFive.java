package HW.les3;
/*
Создать список чисел и заполнить его с консоли
Удалить все числа больше 5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NoMoreFive {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int i = Integer.parseInt(s);
            list.add(i);
        }

        for (int i = 0; i < list.size(); ) {
            if (list.get(i) > 5)
                list.remove(i);
            else
                i++;

        }

        System.out.println(list);
    }
}
