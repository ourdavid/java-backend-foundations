package introduction.rectangle;

import introduction.rectangle.entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");

        System.out.print("Width: ");
        double width = input.nextDouble();
        rectangle.width = width;

        System.out.print("Height: ");
        double height = input.nextDouble();
        rectangle.height = height;

        System.out.println("AREA: " + rectangle.area());
        System.out.println("PERIMETER: " + rectangle.perimeter());
        System.out.println("DIAGONAL: " + rectangle.diagonal());
    }
}
