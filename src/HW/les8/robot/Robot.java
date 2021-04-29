package HW.les8.robot;
/*
Создать класс Robot с двумя полями - power(int), model(String)
Создать коллекцию TreeMap и добавить туда 3 роботов
Реализовать интерфейс Comparable в классе Robot:
- метод compareTo должен сравнивать имена в алфавитном порядке, если имена одинаковые,
то сравнение должно проходить по полю power.
Вывести в консоль содержимое коллекции TreeMap
*/

public class Robot implements Comparable<Robot>{
    private int power;
    private String model;

    public Robot(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int compareTo(Robot o) {
        int result = this.model.compareTo(o.model);
        return result;
        }
}
