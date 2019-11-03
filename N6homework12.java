import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class N6homework12{
	public static void main(String[]args){
		int j = 0, temp;
		int quanPlus = 0, quanMinus=0;
		Random r = new Random();	
		int value = r.nextInt(10);
		System.out.println("Random number is: "+value);
		int[] array = new int[value];
		for (int i = 0; i <= array.length-1; i++){
			array[i] = r.nextInt(21) - 10;
		}
		System.out.println("Original array: " +Arrays.toString(array));
		System.out.println();
		//arranging + and - elements of array 
		for (int i = 0; i <= array.length-1; i++){
			if (array[i]>0){
				if (i != j) { 
					temp = array[i]; 
					array[i] = array[j]; 
					array[j] = temp; 
				} 
				j++; 
			}
		}
		System.out.println("+ and - elements: " +Arrays.toString(array));	
		System.out.println();

		System.out.println("Even and odd indexes: ");
        for (int i = 0; i <= array.length-1; i++) {
        	if (i%2==0)
        	System.out.println("index= "+i+ " = "+ array[i]+" ");	
        }
        for (int k = 0; k <= array.length-1; k++) {
        	if (k%2!=0)
        	System.out.println("index= "+k+ " = "+ array[k]+" ");	
        }
		System.out.println();

		//quantity of odd and even numbers
		for (int i=0; i <= array.length-1; i++){
        	if (array[i]>0){
        		quanPlus++;
        	}
        	else if (array[i]<0){
        		quanMinus++;
        	}   
        }	
		System.out.println("Quantitiy of positive numbers: " +quanPlus);	
		System.out.println("Quantitiy of negative numbers: " +quanMinus);
	}
}