import java.util.Scanner;

public class AreaOfTraingle {
    public static void main(String[] args) {
        float x,y, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of traingle: ");
        x = sc.nextFloat();
        System.out.println("Enter the base of traingle: ");
        y = sc.nextFloat();
        System.out.format("Area of the traingle having height as %f and base as %f is %f",x,y,0.5*x*y);
    }
}
