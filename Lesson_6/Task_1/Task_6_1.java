package Lesson_6.Task_1;

public class Task_6_1 {
 public static void main(String[] args) {
        System.out.println("Калькулятор запущен");
        Presenter pres = new Presenter(new Model(), new View());
        pres.buttonClic();
        System.out.println("Завершение работы");
    }
    /* Упростил реализованный код из 5 семинара для реализации принципа:
    Single responsibility principle (Принцип единственной ответственности). Применяю данный принцип потому, что
    в данном коде каждый класс имеет только одну ответственность которая инкапсулирована в этом классе.
    Класс "Model" - позволяет сделать любые арифметические действия над числами.
    Класс "View" - реализует получение чисел и одного из арифметических действий. */
}
