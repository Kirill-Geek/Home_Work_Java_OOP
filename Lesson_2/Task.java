package Lesson_2;

import java.util.Scanner;

public class Task {

    static Scanner iScanner = new Scanner(System.in);
    // Создал экземпляр класса.
    public static MarketBehaviour news = new MarketBehaviour();

    public static void main(String[] args) {
        int buyer = 1;
        Markets(buyer); // Передаем в метод первого покупателя.
    }

    public static int Markets(int buyer) {
        // Выбираем что делать, добавить покупателя либо выходим из программы
        System.out.println("Выберите действие:\n 0 - Выход из программы.\n 1 - Добавить покупателя");
        char val = iScanner.next().charAt(0);
        if (val == '0') {
            System.out.println("До свидания");
            return 0;
        } else {
            System.out.println(news.getSumBuy());
        }
        return Markets(buyer);
    }

}