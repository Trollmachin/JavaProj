package HW.les6;
/* Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода printKeys:
Вывести на экран список ключей, каждый элемент с новой строки. */

import java.util.HashMap;
import java.util.Map;

public class SolutionKey {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ягода", "Малина");
        map.put("Овощь", "Помидор");
        map.put("Фрукт", "Апельсин");

        printKeys(map);
    }

    private static void printKeys(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
