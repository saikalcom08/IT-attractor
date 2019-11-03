import java.util.Scanner;
public class N4homework11{
	public static void main(String []args){
		double x;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first speed: ");
		double a = scanner.nextDouble(); //   km/h
		System.out.print("Enter second speed: ");
		double b = scanner.nextDouble(); //   m/s
		x = (a*5)/18;
		if (x>b){
			System.out.println(a + " km/h is greater than " + b + " m/s");
		}
		else if (x<b){
			System.out.println(a + " km/h is smaller than " + b + " m/s");
		}
		else {
			System.out.println(a + " km/h is equal to " + b + " m/s");
		}
	}
}


		