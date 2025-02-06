package Lecture11.Exercises.Exercises1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        shape.displayArea(); // Displays the area of the shape
        circle.displayArea(); // Displays the area of the circle
        rectangle.displayArea(); // Displays the area of the rectangle
    }
}