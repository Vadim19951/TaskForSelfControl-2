package task2;

public class ShapeFactory {

    public static Figure ofSquare(double side) {
        Figure figure = new Figure();
        figure.setName("Square");
        figure.setSize(side * side);
        return figure;
    }

    public static Figure ofRectangle(double w, double h) {

        Figure figure = new Figure();
        figure.setName("Rectangle");
        figure.setSize(w * h);
        return figure;
    }

    private ShapeFactory() {

    }
}
