package task2;

public class ShapeFactory {

    static Figure ofSquare(double side) {
        Figure figure = new Figure();
        figure.name = "Square";
        figure.size = side * side;
        return figure;
    }

    static Figure ofRectangle(double w, double h) {

        Figure figure = new Figure();
        figure.name = "Rectangle";
        figure.size = (w * 2) + (h * 2);
        return figure;
    }

    private ShapeFactory() {

    }
}
