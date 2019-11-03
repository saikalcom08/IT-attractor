import java.util.Arrays;
import java.util.Scanner;

public class N2homework14 {
	public static void main(String[] args) {
		int[] numbers = originalArray();
		System.out.println("Original array: "+Arrays.toString(numbers));

		int[] copyNegative = copyOfArray(numbers);
		System.out.println("Array of negative numbers: "+Arrays.toString(copyNegative));
	}

	public static int [] originalArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter numbers with space:");
		int [] numbers = new int[count];
		Scanner numScanner = new Scanner(sc.nextLine());
		for (int i = 0; i < count; i++){
			if (numScanner.hasNextInt()){
				numbers[i] = numScanner.nextInt();
			} 
			else{
				System.out.println("You didn't provide enough numbers");
				break;
			}
		}    
		return numbers;
	}
	public static int[] copyOfArray(int[]input){
		int[]copy = Arrays.copyOf(input,input.length);
		for (int i = 0; i < copy.length; i++){
			copy[i] = -input[i];
		}
		return copy; 
	} 
}