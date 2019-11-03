import java.util.Scanner;
public class N2homework12{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number between 1 to 9: ");
		int number = scanner.nextInt();
		int result;
		String format = "%d * %d = %d";
		for (int i=1; i<=9; i++){
			result = number*i;
			String msg = String.format(format, number, i, result);
			System.out.println(msg);
		}		
	}
}