import java.util.Random;

public class N3homework15{
	public static void main(String[]args){
		int count = 0;
		int checkingNumber;

		Random r = new Random();
		int number = r.nextInt(300)+1;
		System.out.print("Random number is: "+number);
		System.out.println();

		for (int i = 1; i <= number; ++i) {
    		System.out.print(i);
    		for (int j = 1; j <= number; ++j){ 
      			if (i % j == 0) System.out.print("+");
      		}
      		System.out.println();
      	}
	}
}