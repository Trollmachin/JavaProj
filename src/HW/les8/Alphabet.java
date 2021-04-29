package HW.les8;
/*
Ввести с клавиатуры 5 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).
Вывести результат на экран.
Используй метод класса String - toCharArray();
Пример ввода:
String text = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
String text2 = "абв";
String text3 = "ддд";
String text4 = "яяа";
String text5 = "вввв";
Пример вывода:
а 3
б 2
в 6
г 1
д 4
…
я 3
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Alphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (String a : list) {
                char[] ch_array = a.toCharArray();
                for (char b : ch_array) {
                    if (alphabet.get(i).equals(b)) {
                        count++;
                    }
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
        }
    }
}
