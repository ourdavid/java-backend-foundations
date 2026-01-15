package introduction.trianglecomparison;

public class Triangle {
    double a;
    double b;
    double c;


    public double area(){
        double p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public String majorArea(double y){
        return  (area() > y) ? "Larger area: X" : "Larger area: Y";
    }

}
