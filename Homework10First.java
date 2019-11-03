import java.util.Scanner;
public class Homework10First{
    public static void main(String[]args){
        double rate = 21.0;
        double valueForMonth;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter previous value of electric meter: ");
        double previous = scanner.nextDouble();
        System.out.print("Enter current value of electric meter: ");
        double current = scanner.nextDouble();
        valueForMonth = current-previous;
        System.out.println("You have used: " + valueForMonth + " KvT" );
        System.out.println("Rate: 21 som");
        total=valueForMonth * rate;
        System.out.println("Payment: " + total +" som");
        scanner.close();
    }
}