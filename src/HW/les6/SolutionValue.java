package HW.les6;
/* Есть коллекция HashMap<String, String>, туда занесли 3 различные пары. При помощи метода printValues:
Вывести на экран список значений, каждый элемент с новой строки. */

import java.util.HashMap;
import java.util.Map;

public class SolutionValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ягода", "Малина");
        map.put("Овощь", "Помидор");
        map.put("Фрукт", "Апельсин");

        printValues(map);
    }

    private static void printValues(Map<String, String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}