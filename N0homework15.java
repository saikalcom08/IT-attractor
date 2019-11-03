import java.util.Scanner;
import java.util.Arrays;

public class N0homework15{
	public static void main(String[]args){
		boolean check;
		int a, b, c, x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 parameters (a, b, c) to make rectangle (can't be less than 1): ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Enter 2 parameters (x, y) for making hole for rectangle (can't be less than 1): ");
		x = sc.nextInt();
		y = sc.nextInt();
		System.out.println("Entered numbers:  "+a+" "+b+" "+c+" "+x+" "+y);
		System.out.println();
		check = N0homework15.compareWithThreeVariablesWithTwo(a, b, c, x, y);
		if(check==true){
			System.out.println("Exit: Will fit!");
		}
		else if(check==false)
			System.out.println("Exit: Will not fit!");
		sc.close();
	}
	public static boolean compareWithThreeVariablesWithTwo(int a, int b, int c, int with_x, int with_y){
		boolean res = false;
		if(a<=with_x){
			if(b<=with_y || c<=with_y)
				res = true;
			else res = false;
		}
		else if (b<=with_x){
			if(a<=with_y || c<=with_y)
				res = true;
			else res = false;
		}
		else if (c<=with_x){
			if(a<=with_y || b<=with_y)
				res = true;
			else res = false;
		} else {
			res = false;
		}
		return res;
	} 
}