import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class N7homework12{
	public static void main(String[]args){
		Random r = new Random();	
		int people = 10;
		int countF = 0;
		int countN = 0;
		int sumF = 0;
		int sumN = 0;
		double avgF = 0;
		double avgN = 0;
		int[] array = new int[people];
		for (int i = 0; i <= array.length - 1; i++){
			array[i] = r.nextInt(101)+50;
			if(array[i]>100){
				countF++;
				sumF = sumF + array[i];
				avgF = sumF/countF;
				
			}
			else if (array[i]<100){
				countN++;
				sumN = sumN + array[i];
				avgN = sumN/countN;		
			}
		}
		System.out.println("Weight of 25 people: " +Arrays.toString(array));
		System.out.println();
		System.out.println("Average of overweighted people: "+avgF);
		System.out.println("Average of normal weighted people: "+avgN);		
	}
}