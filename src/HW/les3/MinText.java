package HW.les3;
/*
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinText {
    public static void main(String[] args) throws IOException {
        List<String> list= new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        list.add(reader.readLine());
        int min = list.get(0).length();
        for (int i = 0; i <4 ; i++) {
            list.add(reader.readLine());

            if(list.get(i+1).length() < min)
                min = list.get(i+1).length();
        }

        for (int i = 0; i <5 ; i++) {
            if(list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
