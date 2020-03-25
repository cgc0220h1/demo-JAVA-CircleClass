import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        //Test constructor 1
        Circle circle1 = new Circle(5.6);
        display(circle1);

        //Test constructor 2
        Circle circle2 = new Circle(7.8, "green");
        display(circle2);

        //Test constructor 3
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius's circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter radius's color: ");
        String color = scanner.nextLine();

        Circle circle3 = new Circle();
        circle3.setRadius(radius);
        circle3.setColor(color);
        display(circle3);
    }

    public static void display(Circle circle) {
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println();
    }
}
