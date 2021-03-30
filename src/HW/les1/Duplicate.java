package HW.les1;
/* Задача по алгоритмам.
Есть массив чисел, в котором все числа дублируются, кроме одного. Найдите число, которое не имеет дубликатов в массиве.
Пример ввода: {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
Пример вывода: 1
*/

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 5, 4, 2, 1, 6};
        for (int i = 0; i < arr.length; i++) {
            boolean tag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    tag = false;
                    break;
                }
            }
            if(tag) System.out.print(arr[i]);
        }
    }
}
