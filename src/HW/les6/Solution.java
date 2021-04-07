package HW.les6;

import java.util.HashMap;
import java.util.Map;
/*
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода:
ключ - значение
ключ - значение
ключ - значение
ключ - значение
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Ягода", "Малина");
        map.put("Овощь", "Помидор");
        map.put("Фрукт", "Апельсин");
        map.put("Дерево", "Дуб");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
