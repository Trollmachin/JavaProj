package HW.les9;
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
List<String> list = new ArrayList<String>();
String s = list.get(18);
*/

import java.util.ArrayList;
import java.util.List;

public class Solution4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}
