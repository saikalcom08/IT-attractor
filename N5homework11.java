import java.util.Scanner;
import java.lang.Math.*;
public class N5homework11{
	public static void main(String []args){
		double areaCircle;
		double areaSquare;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value of the radius: ");
		double r = scanner.nextDouble(); //   radius of the circle
		System.out.print("Enter side of the square:");
		double a = scanner.nextDouble(); //   side of the square
		areaCircle = Math.PI * Math.pow(r,2);
		areaSquare = Math.pow(a,2);
		System.out.println("The area of circle: "+Math.ceil(areaCircle)+ "cm2");
		System.out.println("The area of square: "+Math.ceil(areaSquare)+ "cm2");
		if (areaCircle>areaSquare){
			System.out.println("The area of CIRCLE is GREATER than area of SQUARE");
		}
		else if (areaCircle<areaSquare){
			System.out.println("The area of CIRCLE is SMALLER than area of SQUARE");
		}
		else {
			System.out.println("The area of CIRCLE is EQUAL to area of SQUARE");
		}
	}
}