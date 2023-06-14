package Lesson_4;

public class Task_2 {
    public static <T> void printArray(T[] array) {
        System.out.println(array.getClass());
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] people = { "Tom", "Alice", "Sam", "Kate", "Bob", "Helen" };
        printArray(people);
        Integer[] num = { 1, 2, 44, 5, 33, 1000 };
        printArray(num);
    }
}
