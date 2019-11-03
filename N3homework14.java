import java.util.Scanner;

public class N3homework14{
	static int number;
	static int sum=0;
	static int count;
	static double avg;
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the numbers. Enter 0 to stop.");	
		
		while(true){
			System.out.print("Number "+ ++count +":");
			number = sc.nextInt();
			if(number==0) {break;}
			sum = sum + number;
			avg = sum/count;	
		}
		System.out.println("You have entered " + count + " numbers");
		System.out.println("Their sum is "+sum);
		System.out.println("Average number is "+avg);
	}
}