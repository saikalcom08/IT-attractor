import java.util.Scanner;
public class N9homework11{
	public static void main(String[]args){
		double years;
		double month;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 1188:");
		double day = scanner.nextDouble();
		if (day>=1 && day<=1188){
			years = day / 365;
			month = (day%365)/31;
			//years = day / 365;
			//month = (day - (years * 365)) / 12;
			if (years == 1 || month == 1){
				System.out.println(Math.round(years)+" year "+ Math.round(month) + " month");
			}
			else
			System.out.println(Math.round(years)+" years "+ Math.round(month) + " months");
		}
		else {
			System.out.println("Out of boundaries.");
		}
	}
}