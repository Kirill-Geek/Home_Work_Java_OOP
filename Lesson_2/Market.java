package Lesson_2;

public class Market {
    int buyer = 0;

    public Market() {
    }

    public String getInfo(int buyers) {
        buyer = buyers;
        return String.format("Ваш № %d", ++buyer);
    }
}

// Поведение очереди
class QueueBehaviour extends Market {
    // 'cashbox' - отвечает за количество касс.
    // Данный класс управляет очередью и направляет каждого на новую кассу.
    int cashbox = 0;

    public QueueBehaviour() {
        super();
    }

    public int getnumbox(int cashboxs) {
        cashbox = cashboxs;
        if (cashbox >= 5) {
            cashbox = 0;
        }
        cashbox++;
        return cashbox;
    }

    public String getNum() {
        return String.format("%s, Ваша касса №%d\n", super.getInfo(buyer), getnumbox(cashbox));
    }
}

// Поведение магазина
class MarketBehaviour extends QueueBehaviour {
    // Данный класс отвечает за осуществление покупок.
    public MarketBehaviour() {
        super();
    }

    public int sumBuy() {
        int sum = (int) (Math.random() * 100);
        return sum;
    }

    public String getSumBuy() {
        return String.format("%s, Ваша касса №%d\n Сумма вашей покупки %d", super.getInfo(buyer),
                super.getnumbox(cashbox), sumBuy());
    }
}
