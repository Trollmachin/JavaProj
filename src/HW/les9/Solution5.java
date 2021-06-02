package HW.les9;
/*
Перехватить исключение (и вывести его на экран, указав его тип), возникающее при выполнении кода:
Map<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/

import java.util.HashMap;
import java.util.Map;

public class Solution5 {
    public static void main(String[] args) {
        try {
            Map<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
}
