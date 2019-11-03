import java.util.Random;
import java.util.Arrays;

public class N2homework15{
	public static void main(String[]args){
		
		int [] array = new int [10];
		
		Random r = new Random();

		int sum = 0;
		
		String templ1 = "%d + %d + %d + %d + %d = %d";
		String msg1 = " ";
		
		for (int i = 0; i < 10; i++){
       		array[i] = r.nextInt(89)+10;
    	}
    	System.out.println("Original array: "+Arrays.toString(array));

    	for (int i=0; i < 10; i++){
    		if(i%2==0){
    			array[i] = array[i];
       			sum = sum + array[i];
       			msg1 = String.format(templ1, array[0], array[2], array[4], array[6], array[8], sum);		
       		}
    	}
       	System.out.println(msg1);
	}
}