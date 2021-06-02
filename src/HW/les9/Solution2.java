package HW.les9;
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution2 {
    public static void main(String[] args) {
        String s = null;

        try {
            String m = s.toLowerCase();
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
}
