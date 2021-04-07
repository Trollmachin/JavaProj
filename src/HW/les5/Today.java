package HW.les5;
/* Посчитать сколько прошло времени с начала сегодняшнего дня. Используйте класс Date. */

import java.util.Date;

public class Today {
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("С начала сегодняшнего дня прошло: " + hours + " ч, " + mins + " мин, " + secs + " сек.");
    }
}
