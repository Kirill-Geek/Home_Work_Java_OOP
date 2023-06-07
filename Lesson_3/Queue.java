package Lesson_3;

public class Queue extends Markets {

    int numBuyers = 1;
    int cashbox = 1;

    public Queue(String names) {
        super(names);
    }

    // Определение номера кассы.
    public int getNumBox() {
        if (this.cashbox > 5) {
            this.cashbox = 1;
            return cashbox++;
        }
        return cashbox++;
    }

    // Присвоение номера покупателю.
    public int getNumBuyers() {
        return numBuyers++;
    }

    public String getInfo() {
        return String.format("Покупатель № %d, Касса № %d", getNumBuyers(), getNumBox());
    }
}
