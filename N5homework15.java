import java.util.Arrays;
import java.util.Scanner;

public class N5homework15{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number for array: ");
		int num = sc.nextInt();
		int [][]array = new int [num+1][num+1];	
		for (int i=1; i<num+1; i++){	
			for (int j=1; j<num+1; j++){
				array[0][i] = 1;
				array[i][j] = array[i-1][j] + array[i][j-1];
				System.out.print(array[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}