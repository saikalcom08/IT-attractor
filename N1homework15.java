public class N1homework15{
	public static void main(String[]args){
		
		String templ = "When %d divided to %d mod is %d";

		for(int i=100; i<=999; i++){

			int number1 = i%47;
			int number2 = i%43;

			
			String msg1 = String.format(templ, i, 47, number1);
			String msg2 = String.format(templ, i, 43, number2);

			if(number1==43){
				System.out.println(msg1);	
			}
			if(number2==47-43){
				System.out.println(msg2);	
			}	  
		}
	}
}