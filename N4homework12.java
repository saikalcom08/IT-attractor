import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class N4homework12{
	public static void main(String[]args){ 
		int previousNumber = -1;
		int nextNumber = 1;
		int sum = 0;
		Random r = new Random();	
		int value = r.nextInt(15) + 1;
        System.out.println("Fibbonacci series of " + value);
        for (int i = 0; i <= value-1; i++){
        	sum = previousNumber + nextNumber;
            System.out.print(sum + " ");        
            previousNumber = nextNumber;
            nextNumber = sum;
		}
		System.out.println();
		System.out.println("Reverse order:");
        for (int i = value; i >= 1; i--){
        	sum = nextNumber - previousNumber;
            System.out.print(nextNumber + " ");
            nextNumber = previousNumber;
            previousNumber = sum;
		}
	}
}