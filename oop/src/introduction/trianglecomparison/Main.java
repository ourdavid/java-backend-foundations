package introduction.trianglecomparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        x.a = Double.parseDouble(scanner.nextLine());
        x.b = Double.parseDouble(scanner.nextLine());
        x.c = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the measures of triangle Y: ");

        y.a = Double.parseDouble(scanner.nextLine());
        y.b = Double.parseDouble(scanner.nextLine());
        y.c = Double.parseDouble(scanner.nextLine());

        System.out.println("Triangle X area: " + String.format("%.4f",x.area()));
        System.out.println("Triangle Y area: " + String.format("%.4f",y.area()));
        System.out.println(x.majorArea(y.area()));

        scanner.close();
    }
}
