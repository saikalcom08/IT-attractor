import java.util.Arrays;

public class N1homework14{
	public static void main(String[]args){
		System.out.println("maximum integer numbers: " + max(8, 9, 8));
		System.out.println("maximum double numbers: " + max(8.1, 9.8, 8.0));
	}
	public static int max(int a, int b, int c){
		int[] array = {a,b,c};
		Arrays.sort(array);
		return array[array.length-1];
	}
	public static double max(double a, double b, double c){
		double[] array = {a,b,c};
		Arrays.sort(array);
		return array[array.length-1];
	}
} 