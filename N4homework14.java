import java.util.Scanner;

public class N4homework14{
	public enum DayOfWeek{
		WEEK, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	public static void main(String[]args){
		int num = number();
		if(num>0 && num<8){
			DayOfWeek args1[] = DayOfWeek.values();
			DayOfWeek arg = args1[num];
			days_of_week(arg);
		}
		else System.out.print("I dont know this day"); 
	}
	public static int number(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a days of the week(1-7):");
		int num = sc.nextInt();
		sc.close();
		return num;
	}
	public static void days_of_week(DayOfWeek day) {
		switch (day) {
			case MONDAY: 
			System.out.println("Monday:\n 8:00 work \n17:00 gym");
			break;

			case TUESDAY: 
			System.out.println("Tuesday:\n8:00 work \n17:00 programming course");
			break;

			case WEDNESDAY: 
			System.out.println("Wednesday:\n8:00 work \n17:00 preparation for IELTS");
			break;

			case THURSDAY: 
			System.out.println("Thursday:\n8:00 work \n17:00 programming course");
			break;

			case FRIDAY: 
			System.out.println("Friday:\n8:00 work \n17:00 French course");
			break;

			case SATURDAY: 
			System.out.println("Saturday:\n8:00 hiking \n21:00 restaurant");
			break;

			case SUNDAY: 
			System.out.println("Sunday:\nDay off");
			break;
		}
	}
}