package HW.les9;
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/

public class Solution3 {
    public static void main(String[] args) {
        int[] m = new int[2];

        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    }
}
