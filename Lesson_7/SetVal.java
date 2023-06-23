package Lesson_7;

import java.util.Scanner;

public class SetVal {
    public Scanner iScan = new Scanner(System.in);
    public int count = 0; //Счётчик для ввода комплексных чисел.
    public String[] Setvalue() {
        String[] val; // Создаем массив для хранения чисел.
        System.out.println("Введите два числа");
        System.out.println("Формат ввода через пробел. Пример '12 34' ");
        String Value = iScan.nextLine();
        val = Value.split(" ");
        /*Далее идет проверка на правильность введенных данных.*/
        for (int i = 0; i < val.length; i++) {
            try {
                Integer.parseInt(val[i]);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не цифры");
                if (count == 1) {
                    count = 0;
                    return Setvalue();
                } else {
                    count = 1;
                    return Setvalue();
                }

            }
        }
        if (val.length == 2) {
           return val; 
        }
        return Setvalue();
    }

    public char Act() {
        System.out.println("Выберите одно из действий:\n1 +\n2 -");
        char act = iScan.next().charAt(0);
        return act;
    }

}
