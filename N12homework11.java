import java.util.Scanner;
public class N12homework11{
	public static void main (String []agrs){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Operation: ");
		String operation = scanner.nextLine();
		operation = operation.toLowerCase();
		operation = operation.trim();
		System.out.print("1st number: ");
		double number1 = scanner.nextDouble();
		System.out.print("2nd number: ");
		double number2 = scanner.nextDouble();
		String conditionPlusSymbol = "+";
		String conditionPlus = "plus";
		String conditionMinusSymbol = "-";
		String conditionMinus =  "minus";
		String conditionMultSymbol = "*"; 
		String conditionMult = "multiply";
		String conditionDivSymbol = "/";
		String conditionDiv = "divide";
		String conditionModSymbol = "%";
		String conditionMod = "mod";
		double result=0;

		if ((operation.equals(conditionPlus)) || (operation.equals(conditionPlusSymbol))){
			result = number1 + number2;
		}
		else if ((operation.equals(conditionMinus)) || (operation.equals(conditionMinusSymbol))){
			result = number1 - number2;
		}
		else if ((operation.equals(conditionMult)) || (operation.equals(conditionMultSymbol))){
			result = number1 * number2;
		}
		else if ((operation.equals(conditionDiv)) || (operation.equals(conditionDivSymbol))){
			result = number1 / number2;
		}
		else if ((operation.equals(conditionMod)) || (operation.equals(conditionModSymbol))){
			result = number1 % number2;
		}
		else {
			System.out.println("I don't know this operation!");
		}
		String format = "Result: %.1f %s %.1f = %.2f";
		String msg = String.format(format, number1, operation, number2, result);
		System.out.println(msg);
	}
}