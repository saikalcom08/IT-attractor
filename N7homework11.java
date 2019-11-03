import java.util.Scanner;
public class N7homework11{
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter any text: ");
		String sentence = scanner.nextLine();
		System.out.print("Please enter any word: ");
		String word = scanner.nextLine();
		boolean empty1 = sentence.isEmpty();
		boolean empty2 = word.isEmpty();
		int result = sentence.toLowerCase().indexOf(word.toLowerCase());
		if (empty1==true && empty2==true){
			System.out.println("Sorry, you didn't write anyting. Bye"); 			
		}
		else if ((empty1 && empty2) == false){
			if (result != -1 ) {
				System.out.println("I found the word. Index number is: " + (result+1));
			} else {
				System.out.println("not found");
			}
		}	
	}
}