import java.util.Scanner;
public class N8homework11{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a time in minutes: ");
		int time = scanner.nextInt();
		int [] even = {0, 2, 4, 6, 8};
		int [] odd = {1, 3, 5, 7, 9};
		for (int i=0; i<=time; i++){
			if (time%5==0 || time%5==even[i]){
				System.out.println("Red");
			}
			else if (time%5==odd[i]){
				System.out.println("Green");
			}
		}
	}
}