import java.util.Scanner;
public class Homework10Second{
    public static void main(String[]args){
        double a;
        double b;
        double c;
        double D; //Discriminant
        double x1; // root 1 
        double x2; // root 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digits:");
        System.out.print("a = ");
        a = scanner.nextDouble();
        System.out.print("b = ");
        b = scanner.nextDouble();
        System.out.print("c = ");  
        c = scanner.nextDouble();
        D = (b*b) - (4*a*c);
        x1 = (-b+Math.sqrt(D))/(2*a);
        x2 = (-b-Math.sqrt(D))/(2*a);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
    }
}