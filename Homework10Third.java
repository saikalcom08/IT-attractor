import java.util.Scanner;
public class Homework10Third{
    public static void main(String[]args){
        double rate1 = 16.24;
		double rate2 = 21.8;
		double rate3 = 25.6;
		double firstLevel = 115;
		double secondLevel = 190;
        double valueForMonth = 0;
        double firstLevelValue = 0;
        double secondLevelValue = 0;
        double thirdLevelValue = 0;
        double total;
        double total1;
        double total2;
        double total3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter previous value of electric meter: ");
        double previous = scanner.nextDouble();
        System.out.print("Enter current value of electric meter: ");
        double current = scanner.nextDouble();
		System.out.print("Enter the number of residence:");
		int numberPeople = scanner.nextInt();
		System.out.println("\n");
		System.out.println("YOU HAVE USED:");
		valueForMonth = current - previous;
		firstLevelValue = firstLevel * numberPeople;
		secondLevel = secondLevel * numberPeople;
		secondLevelValue = secondLevel - firstLevelValue;
        thirdLevelValue =  valueForMonth - (firstLevelValue + secondLevelValue);
        System.out.println("First level: " + firstLevelValue + " KvT" );
        System.out.println("Second level: " + secondLevelValue + " KvT" );
        System.out.println("Third level: " + thirdLevelValue + " KvT" );
        System.out.println("\n");
        System.out.println("Rate: 16.24 som, 21.8 som, 25.6 som");
        System.out.println("\n");
        System.out.println("TO PAY:");
        total1=firstLevelValue * rate1;
        total2=secondLevelValue * rate2;
        total3=thirdLevelValue * rate3;
        total = total1 + total2 + total3;
        System.out.println("First level: " + Math.ceil(total1) + " som" );
        System.out.println("Second level: " + Math.ceil(total2) + " som" );
        System.out.println("Third level: " + Math.ceil(total3) + " som" );
        System.out.println("Payment in total: " + total +" som");
        scanner.close();
    }
}