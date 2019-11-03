import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class N3homework12{
	public static void main(String[]args){
		Random r = new Random();	
		int value = r.nextInt(15) + 1;
		System.out.println("Random number is: "+value);
		int[] array = new int[value];
		for (int i = 0; i <= array.length - 1; i++){
			array[i] = r.nextInt(560) + 275;
		}
		System.out.println("Original array: " +Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Ascending order: " +Arrays.toString(array));
		System.out.print("Descending order: ");
		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}