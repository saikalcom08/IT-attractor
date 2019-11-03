import java.util.Scanner;
public class N6homework11{
	public static void main(String []args){
		String ei;
		String dt;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter any text: ");
		String text = scanner.nextLine();
		boolean empty = text.isEmpty();
		if (empty==true){
			System.out.println("Sorry, you didn't write anyting. Bye"); 			
		}
		else if (empty==false){
			ei = text.replace('e','i');
			dt = ei.replace('d','t');
			System.out.println("replacing e with i " + ei);
			System.out.println("replacing d with t " + dt);
		}	
	}
}