package introduction.trianglecomparison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the measures of triangle X: ");
        double xA, xB, xC, yA, yB, yC;

        xA = Double.parseDouble(scanner.nextLine());
        xB = Double.parseDouble(scanner.nextLine());
        xC = Double.parseDouble(scanner.nextLine());

        double pX = p(xA,xB,xC);
        double areaX = area(pX,xA,xB,xC);


        System.out.println("Enter the measures of triangle Y: ");

        yA = Double.parseDouble(scanner.nextLine());
        yB = Double.parseDouble(scanner.nextLine());
        yC = Double.parseDouble(scanner.nextLine());

        double pY = p(yA,yB,yC);
        double areaY = area(pY,yA,yB,yC);

        System.out.println("Triangle X area: " + String.format("%.4f",areaX));
        System.out.println("Triangle Y area: " + String.format("%.4f",areaY));
        System.out.println(majorArea(areaX,areaY));

        scanner.close();
    }static double p(double a, double b, double c){
        return (a+b+c)/2;
    }static double area(double p, double a,double b,double c){
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }static String majorArea(double x, double y){
        return  (x > y) ? "Larger area: X" : "Larger area: Y";
    }
}
