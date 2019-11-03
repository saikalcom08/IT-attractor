import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class N5homework12{
	public static void main(String[]args){
		double averageT = 0;
		int sum = 0;
		Random r = new Random();	
		int value = r.nextInt(15) + 1;
		System.out.println("Random day: "+value);
		int[] array = new int[value];
		for (int i = 0; i <= array.length - 1; i++){
			array[i] = r.nextInt(50);
		}
		System.out.println("Temperature: " +Arrays.toString(array));
		for (int i = 0; i <= array.length - 1; i++){
			sum = sum + array[i];
			averageT = sum / array.length; //calculating average temperature of N days
		}
		System.out.println("Average Temperature: " + averageT);
	}
}