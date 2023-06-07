/*
 * Определяем конструктор для Прямоугольника.
 */

public class Rectangle {
    /**
     * @param valX Сторона х.
     * @param valY Сторона y.
     */
    int valX;
    int valY;

    public Rectangle() {
        valX = 5;
        valY = 4;
    }

    public Rectangle(int x, int y) {
        valX = x;
        valY = y;
    }

    public int calculateArea() {
        return valX * valY;
    }

    public int calculatePerimeter() {
        return 2 * (valX + valY);
    }

    public String getInfo() {
        return String.format("Площадь = %d\n Периметр = %d", calculateArea(), calculatePerimeter());
    }

}
