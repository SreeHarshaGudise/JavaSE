import java.util.Scanner;

public class AreaOfTraingleUsingSides {
    public static void main(String[] args) {
        int a,b,c;
        float s;
        double area;
        System.out.println("Enter the sides of triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = 0.5f*(a+b+c);
        System.out.println("Value of S is "+s);

        System.out.println("Area of traingle using S is sqrt(s*(s-a)*(s-b)*(s-c)) ");
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of given dimension traingle is "+area);

    }
}
