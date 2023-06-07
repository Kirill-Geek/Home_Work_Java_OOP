package Lesson_3;

import java.util.Scanner;

public class Task_1 {
    static Scanner iScanner = new Scanner(System.in);
    static Queue newMarket = new Queue("Santa"); // Создали экземпляр класса.

    public static void main(String[] args) {
        int num = 0;
        newMarket.open(); // открытие магазина.
        met(); // добавление клиента.
        newMarket.close(); // Закрытие магазина.
    }

    public static int met() {
        System.out.println("Выберите действие:\n 0 - Выход из программы.\n 1 - Добавить покупателя.\n");
        char val = iScanner.next().charAt(0);
        if (val == '0') {
            System.out.println("До свидания");
            return 0;
        } else {
            System.out.println(newMarket.getInfo());
            System.out.printf("Сумма покупки %d\n", newMarket.getSumBuy());
        }
        return met();
        // В методе "met" происходит добавление клиента, вывод информации о нем.
    }
}