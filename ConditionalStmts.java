import java.util.Scanner;

import java.util.*;

public class ConditionalStmts {
    public static void main(String[] args) {
        // int num;
        // int m1,m2,m3;
        // float avg;
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        int a,b,opt;
        System.out.println("MENU OPTIONS: \n1. SUM\n2. DIV\n3. SUB\n4. MUL\n");
        System.out.println("Enter two numbers to perform menu option.");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Select menu option to perform operation on given two numbers ");
        opt = sc.nextInt();

        // num = sc.nextInt();
        // m1 = sc.nextInt();
        // m2 = sc.nextInt();
        // m3 = sc.nextInt();

        // avg = (m1+m2+m3)/3f;

        // STUDENT CHALLENGE

        // if(num%2==0)
        // {
        //     System.out.println(num +" is even");
        // }
        // else{
        //     System.out.println(num +" is odd");
        // }

        // if(num>=14 && num<=55)
        // {
        //     System.out.println("Younger");
        // }
        // else{
        //     System.out.println("not younger");
        // }

        // if(avg>=70)
        // {
        //     System.out.println("Grade A");
        // }
        // else if(avg>=60 && avg<70)
        // {
        //     System.out.println("Grade B");
        // }
        // else
        // {
        //     System.out.println("Grade C");
        // }


        // if(str.matches("[0-9]+"))
        // {
        //     System.out.println("It is decimal number");
        // }
        // else if(str.matches("[0-9A-F]+"))
        // {
        //     System.out.println("It is hexadecimal number");
        // }
        // else if(str.matches("[01]+"))
        // {
        //     System.out.println("It is binary number");
        // }
        // else if(str.matches("[0-7]+"))
        // {
        //     System.out.println("It is octal number ");
        // }

        //SWITCH CASE
        // switch(n)
        // {
        //     case 1:
        //         System.out.println("1");
        //         break;
        //     case 2:
        //         System.out.println("2");
        //         break;
        //     case 3:
        //         System.out.println("3");
        //         break;
        //     default:
        //         System.out.println("Not matched");
        // }


        // Menu Program
        switch(opt)
        {
            case 1: System.out.println("Sum of two given numbers "+ a + " and "+b+" is "+ (a+b));
                break;
            case 2: System.out.println("Division of two given numbers "+ a + " and  "+ b + " is "+(a/b));
                break;
            case 3: System.out.println("Multiplication of two given numbers "+a+" and "+b+" is "+ (a*b));
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}
