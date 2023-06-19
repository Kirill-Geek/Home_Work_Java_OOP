package Lesson_6.Task_2;

public class Phone {
    public Phone(String name){
        System.out.println(name);
        new Call(37529555);
        new SendSMS().SendMessage("Привет");
        new SendEmail().SendMessage("Привет");
    }
}
