package HW.les9;
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Solution {
    public static void main(String[] args) {
        int a;
        try {
            a = 42 / 0;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
