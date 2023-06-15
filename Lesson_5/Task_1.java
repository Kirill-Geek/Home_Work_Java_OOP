package Lesson_5;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Калькулятор запущен");
        Presenter pres = new Presenter(new ResModel(), new View());
        pres.buttonClic();
        System.out.println("Завершение работы");
    }
}