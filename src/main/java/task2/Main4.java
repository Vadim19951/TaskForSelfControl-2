package task2;

/*
Статические фабрики

Создайте класс ShapeFactory с static Figure ofSquare(double side) и ofRectangle(w, h).
Запретите new ShapeFactory() через private конструктор.
 */

public class Main4 {
    public static void main(String[] args) {
        Figure f1 = ShapeFactory.ofRectangle(2.0, 3.5);
        Figure f2 = ShapeFactory.ofSquare(5.5);
        System.out.println(f1.getName() + " " + f1.getSize());
        System.out.println((f2.getName() + " " + f2.getSize()));

    }

}
