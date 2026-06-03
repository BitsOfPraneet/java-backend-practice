class Shape {
    void area() {
        System.out.println("Calculating area of a generic shape");
    }
}
class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = π * r^2");
    }
}
class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle = length * width");
    }
}
public class day3 {
    public static void main(String[] args) {
        Shape myShape1 = new Circle();
        Shape myShape2 = new Rectangle();
        myShape1.area();
        myShape2.area();
    }
}