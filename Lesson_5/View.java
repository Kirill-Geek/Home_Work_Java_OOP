package Lesson_5;

import java.util.Scanner;

public class View{

    Scanner iScan = new Scanner(System.in);

    public int getValue() {
        System.out.println("Введите число");
        return iScan.nextInt();
    }
    public char getAct(){
        System.out.println("Выберите одно из действий '+', '-', '*', '/'");
        return iScan.next().charAt(0);
    }

}
