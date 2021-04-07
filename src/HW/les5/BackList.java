package HW.les5;
/*
Ввести с клавиатуры 5 чисел и заполнить ими список. Вывести их в обратном порядке. Использовать только цикл for.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BackList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.println(list.get(i));
        }

    }
}
