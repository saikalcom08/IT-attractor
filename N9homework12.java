public class N9homework12{
	public static void main(String[]args){
		int number1;
		int number2;
		int mult;
		for (number1=1; number1<10; ++number1)
		{
			System.out.format("+---");
			System.out.format("| %d |",number1);
			for (number2=1; number2<10; ++number2)
			{
				System.out.format(number1*number2+ " ");  
			}
			System.out.println();
		} 	
	}
}