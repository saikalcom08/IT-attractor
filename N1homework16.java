import java.util.*;

public class N1homework16{
	static Random r = new Random();
	static String [] myArray = { "Start of the day",
		"Getting up from bed with bad mood",
		"Getting up from bed with good mood",
		"Falling from bed",
		"Jogging in the park",
		"Exericising on the balcony",
		"Preparing strong coffee",
		"Cooking nutritious breakfast",
		"Taking yesterday's salad",
		"Tire gone off",
		"Reaching to the office by walk",
		"Reaching to the office by public bus",
		"Reaching to the office by my car",
		"Coming on time",
		"Getting late to work",
		"The end"
	};
	static String [] newArray = new String[0];
	static int j = 1;
	public static void main(String[]args){
		actions(myArray[0]);
		//actions(myArray[1]);
		//actions(myArray[2]);
		//..
		//actions(myArray[15]);
		for(int i = newArray.length-1;i>=0;i--){
			System.out.println( j + " " + newArray[i]);
			j++;
		}
		System.out.println();
		int mood = r.nextInt(2)-1;
		if(mood<0){
			System.out.println("Unlucky day :( ");
		}
		else if(mood>1){
			System.out.println("Lucky day :) ");
		}
		else if(mood==0)System.out.println("Normal day :/ ");
	}

	public static String goLeftgoRight(int maxNum1, int maxNum2, String variant1, String variant2){
		int randomNumber = r.nextInt(maxNum2)+1;
		if(maxNum1 <= randomNumber)
		{
			return variant1;
		}
		else{
			return variant2;
		}
	}
	public static void actions(String variant){
		
		switch (variant){
	        case "Start of the day": //Nachalo dnia
	        	String st1 = goLeftgoRight(1, 2, myArray[1], myArray[2]);
	        	actions(st1); 
	            break;
	        case "Getting up from bed with bad mood"://podnimaius s krovati s levoi nogi
	            String st2 = goLeftgoRight(7, 10 , myArray[3], myArray[4]);
	        	actions(st2); 
	            break;
	        case "Getting up from bed with good mood": //ponimaius s krovati s pravoi nogi
	        	String st3 = goLeftgoRight(4, 6 , myArray[4], myArray[5]);
	        	actions(st3);
	            break;
	        case"Falling from bed": //padaiu s krovati 
	            String st4 = goLeftgoRight(8, 12 , myArray[6], myArray[7]);
	        	actions(st4);
	            break;
	        case "Jogging in the park": //probejka po allee
	            String st5 = goLeftgoRight(8, 12 , myArray[6], myArray[7]);
	        	actions(st5);
	            break;
	        case "Exericising on the balcony": //fiz zariadka
	            String st6 = goLeftgoRight(1, 4 , myArray[7], myArray[8]);
	        	actions(st6);
	            break;
	        case "Preparing strong coffee": //krepkiy kofe
	            String st7 = goLeftgoRight(2, 5 , myArray[9], myArray[12]);
	        	actions(st7);
	            break;
	        case "Cooking nutritious breakfast": //gotovliu zavtrak
	            String st8 = goLeftgoRight(2, 5 , myArray[9], myArray[12]);
	        	actions(st8);
	            break;
	        case "Taking yesterday's salad": //dostaiu v4erawnyi salat
	            String st9 = goLeftgoRight(2, 5 , myArray[9], myArray[12]);
	        	actions(st9);
	            break;
	        case "Tire gone off": //spustilo koleso 
	            String st10 = goLeftgoRight(2, 8 , myArray[10], myArray[11]);
	        	actions(st10);
	            break;
	        case "Reaching to the office by walk": //dobiraius na rabotu pewkom
	            String st11 = goLeftgoRight(2, 8 , myArray[13], myArray[14]);
	        	actions(st11);
	            break;
	        case "Reaching to the office by public bus": //dobiraius na rabotu na marwrutke
	            String st12 = goLeftgoRight(1, 2 , myArray[13], myArray[14]);
	        	actions(st12);
	            break;
	        case "Reaching to the office by my car": //dobiraius na rabotu na svoim avto
	            String st13 = goLeftgoRight(5, 8 , myArray[13], myArray[14]);
	        	actions(st13);
	            break;
	        case "Coming on time": //prihoju vovremia
	            String st14 = goLeftgoRight(1, 1 , myArray[15], myArray[15]);
	        	actions(st14);
	            break;
	        case "Getting late to work": //opazdyvaiu na rabotu
	            String st15 = goLeftgoRight(1, 1 , myArray[15], myArray[15]);
	        	actions(st15);
	            break;
	        default: break;
		}
		newArray = Arrays.copyOf(newArray, newArray.length+1);
		newArray[newArray.length-1] = variant;
	}
}