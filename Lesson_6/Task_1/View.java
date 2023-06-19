package Lesson_6.Task_1;
import java.util.Scanner;
public class View{

    Scanner iScan = new Scanner(System.in);

    public double getValue() {
        System.out.println("Введите число");
        return iScan.nextDouble();
    }
    public char getAct(){
        System.out.println("Выберите одно из действий '+', '-', '*', '/'");
        return iScan.next().charAt(0);
    }
}
