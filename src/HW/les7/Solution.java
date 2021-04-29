package HW.les7;
/*
Создать словарь (Map<String, String>) занести в него 5 записей по принципу
«Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию:
- создать метод getCountTheSameFirstName(Map<String, String> map, String name),
   который должен вернуть количество пар с именем, которое приходит в аргумент name
- создать метод getCountTheSameLastName(Map<String, String> map, String lastName),
   который должен вернуть количество пар с фамилией, которая приходит в аргумент lastName
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Snow", "John");
        map.put("Connor", "John");
        map.put("Lang", "Sara");
        map.put("Wick", "John");
        map.put("Parker", "Piter");

    }

    public static  int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getValue().equals(name))
                count++;

        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName))
                count++;
        }
        return count;

    }
}
