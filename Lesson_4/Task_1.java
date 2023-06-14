package Lesson_4;

import java.lang.*;

public class Task_1 {
    public static <T> void printElement(T arg) {
        System.out.println(arg.getClass());
    }

    public static void main(String[] args) {
        int a = 2;
        printElement(a);
        String b = "Hello";
        printElement(b);
        boolean c = true;
        printElement(c);
        float d = 2.2f;
        printElement(d);
        char e = 'W';
        printElement(e);
        double f = 21.1;
        printElement(f);
    }
}
