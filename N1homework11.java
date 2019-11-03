import java.util.Scanner;
public class N1homework11{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the name of your favourite footbal team: ");
		String team = scanner.nextLine();
		boolean empty = team.isEmpty();
		if (empty==true){
			System.out.println("Sorry, you didn't write anyting. Bye"); 			
		}
		else if (empty==false){
			System.out.println("The length of the text: "+ team.length());
			System.out.println("Uppercase mode: "+ team.toUpperCase());
			System.out.println("Lowercase mode: "+ team.toLowerCase());
		}	
	}
}