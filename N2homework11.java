import java.util.Scanner;
public class N2homework11{
	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter first surname: ");
		String surname1 = scanner.nextLine();
		System.out.print("Please enter second surname: ");
		String surname2 = scanner.nextLine();
		boolean empty1 = surname1.isEmpty();
		boolean empty2 = surname2.isEmpty();
		if (empty1==true && empty2==true){
			System.out.println("Sorry, you didn't write surname. Bye"); 			
		}
		else if (surname1.length() > surname2.length()){
			System.out.println("This surname is the longest one: "+surname1+ "\nLength of the text is: "+surname1.length());
		}
		else if (surname1.length() < surname2.length()){
			System.out.println("This surname is the longest one: "+surname2+ "\nLength of the text is: "+surname2.length());
		}
		else if (surname1.length() == surname2.length()){
			System.out.println("They are equal: "+surname1+", "+surname2+ "\nLength of the texts is: "+surname2.length());
		}
	}
}