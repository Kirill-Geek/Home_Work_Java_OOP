package Lesson_3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Markets implements Comparable<Markets> {
    List<Integer> Buyers = new ArrayList<>();
    int ollSum = 0;
    int sum = 0;
    String name;
    int count = 1;

    public Markets(String name) {
        this.name = name;
    }

    public Markets() {
        this("");
    }

    // Метод "getSumBuy" определяет сумму покупки и происходит запись в коллекцию.
    public int getSumBuy() {
        sum = (int) (Math.random() * 1000);
        ollSum = ollSum + sum;
        Buyers.add(sum);
        return sum;
    }

    // открытие Магазина.
    public void open() {
        System.out.printf("Магазин '%S' открыт\nДобро пожаловать\n", this.name);
    }

    // Закрытие магазина. Подсчёт выручки. Перечисление совершенных покупок.
    public void close() {
        System.out.println("Магазин закрыт ");
        System.out.printf("Выручка магазина %d \n", this.ollSum);
        for (Integer person : Buyers) {
            System.out.printf("%d -  %s\n", count++, person);
        }
        GetNamKas();
    }

    // Реализация интерфейса Comparator<E>.
    public int compareTo(Markets anotherMarkets) {
        if (this.sum == anotherMarkets.sum) {
            return 0;
        } else if (this.sum < anotherMarkets.sum) {
            return -1;
        } else {
            return 1;
        }
    }

    // Реализация функционального интерфейса.
    public void GetNamKas() {
        Consumer<String> printConsumer = t -> System.out.printf("На смене был(а) : %s \n", t);
        List<String> cities = Arrays.asList("Александра", "Дарья", "Валентина", "Мария", "Анатолий");
        cities.forEach(printConsumer);
    }
}