package Lesson_7;
import java.util.Scanner;
public class Task {
    static Scanner iScan = new Scanner(System.in);
    static Presenter presenter = new Presenter(new SetVal(), new Result());
    public static void main(String[] args) {
        System.out.println("Начало программы");
        Calc();
        System.out.println("Программа завершена");

    }

    public static int Calc() {
        System.out.println(
                "Введите: \n0 - Для выхода \n1 - Продолжить");
        int i = iScan.nextInt();
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            presenter.buttonClic();
        }
        return Calc();
    }

}
