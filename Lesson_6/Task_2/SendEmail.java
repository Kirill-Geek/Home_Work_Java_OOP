package Lesson_6.Task_2;

public class SendEmail implements SendMessage{
    @Override
    public void SendMessage(String text) {
        System.out.printf("%s - Отправлено по Email\n", text);
    }
}
