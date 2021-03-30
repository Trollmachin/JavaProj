package HW.les3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
Создать список чисел и заполнить его с консоли следующим образом:
                чётные числа добавляют в конец списка, нечётные — в начало.
*/


public class EvenOdd {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int i = Integer.parseInt(s);
            if (i % 2 == 0)
                list.add(i);
            else
                list.add(0, i);
        }
        System.out.println(list);
    }
}
