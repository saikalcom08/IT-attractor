import java.util.Scanner;
public class N10homework11{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your surname: ");
		String surname = scanner.nextLine();
		System.out.print("Enter your residence: ");
		String residence = scanner.nextLine();
		System.out.print("Enter your year of birth: ");
		int age = scanner.nextInt();
		name = name.trim();
		surname = surname.trim();
		residence = residence.trim();
		name = name.toUpperCase();
		surname = surname.toUpperCase();
		age = 2019 - age;
		String format = "Your name is, %s %s. And your age %d years old, and you are from %s.";
		String msg = String.format(format, name, surname, age, residence);
		System.out.println(msg);
	}
}