import java.util.Scanner;
public class N3homework11{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of the x: ");
		double x = scanner.nextDouble();
		if (x>0){
			System.out.println("y= " + Math.pow(Math.asin(x),2));
		}
		else{
			System.out.println("y= " + (1.0-(2*Math.asin(Math.pow(x,2)))));
		}
	}
}
