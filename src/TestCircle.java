import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius's circle: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter radius's color: ");
        String color = scanner.nextLine();
        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.setColor(color);
        System.out.println("Color circle: " + circle.getColor());
        System.out.println("Color radius: " + circle.getRadius());
    }
}
