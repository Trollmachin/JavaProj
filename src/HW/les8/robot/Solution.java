package HW.les8.robot;

import HW.les8.robot.Robot;

import java.util.Map;
import java.util.TreeMap;
/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
- метод compareTo должен сравнивать имена в алфавитном порядке.
Вывести в консоль содержимое коллекции TreeMap
*/

public class Solution {
    public static void main(String[] args) {
        Robot r1 = new Robot(150, "C-3PO");
        Robot r2 = new Robot(256, "R2-D2");
        Robot r3 = new Robot(5000, "IG-11");

        Map<Robot, String> map = new TreeMap<>();
        map.put(r1, "text1");
        map.put(r2, "text2");
        map.put(r3, "text3");

        for (Map.Entry<Robot, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
