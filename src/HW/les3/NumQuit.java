package HW.les3;
/*
Создать список из целых чисел и заполнить его с консоли
Ввод целых чисел с клавиатуры продолжается, пока не ввели 0
После того, как ввод завершён - вывести все элементы списка в консоль
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class NumQuit {
    public static void main(String[] args) throws IOException {
        List<Integer> nums = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int i = Integer.parseInt(s);
            nums.add(i);
        }
        System.out.println(nums);
    }
}
