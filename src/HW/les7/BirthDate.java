package HW.les7;
/*
Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него 5 записей по принципу:
«Имя» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
map.put("Jhon", new Date("JUNE 1 1980"));
map.put("Mark", new Date("JUNE 5 1999"));
map.put("Elone", new Date("DECEMBER 13 1996"));
map.put("Stieve", new Date("JUNE 1 1980"));
map.put("Clark", new Date("MARCH 1 1980"));
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BirthDate {
    private static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<>();
        map.put("Jhon", new Date("JUNE 1 1980"));
        map.put("Mark", new Date("JUNE 5 1999"));
        map.put("Elone", new Date("DECEMBER 13 1996"));
        map.put("Stieve", new Date("JUNE 1 1980"));
        map.put("Clark", new Date("MARCH 1 1980"));

        return map;

    }

    private static void removeSummerBDay(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            int month = iterator.next().getValue().getMonth() + 1;
            if (6 <= month && month <= 8) {
                iterator.remove();
            }
        }

    }
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        for(Map.Entry<String, Date> pair : map.entrySet()){
            String name = pair.getKey();
            Date date = pair.getValue();
            System.out.println( name + ": " + date);

        }
        System.out.println(" ");
        removeSummerBDay(map);
        for(Map.Entry<String, Date> pair : map.entrySet()){
            String name = pair.getKey();
            Date date = pair.getValue();
            System.out.println( name + ":" + date);
        }
    }
}
