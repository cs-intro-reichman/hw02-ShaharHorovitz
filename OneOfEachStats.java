import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) { 
	int T = Integer.parseInt(args[0]); //number of expiremnts
	int seed = Integer.parseInt(args[1]);
	Random random = new Random(seed);

	int count2 = 0; 
	int count3 = 0; 
	int count4ormore = 0;
	double avgOfKids = 0;
	
	for (int i =0; i<T; i++){
		boolean IsGiral = false;
		boolean IsBoy = false; 
		double randomNumber;
	
		int count = 0;
		while (IsGiral== false || IsBoy ==false){
			randomNumber = random.nextDouble();
		if (randomNumber>0.5){ //if the random number generated is more then 0.5 it's a boy
			//System.out.print("b ");
			IsBoy = true;
		}
		else{
			//System.out.print("g ");
			IsGiral = true;
		}
		count++;
	
	}
	avgOfKids += (double) count;
	//System.out,println("");
	if (count ==2){
			count2++;
		}
	else if (count ==3){
			count3++;
		}
	else if(count >= 4) {
			count4ormore++; 
		}
	}
	//out of for
	int mostCommon = 0;
	if(count3 < count2 || count4ormore< count2){
		mostCommon = 2; 
	}
	if (count3 >count2 && count3 > count4ormore){
		mostCommon = 3; 
	}
	else {
		mostCommon = 4;
	}
	
	System.out.println("Average: " +avgOfKids/T + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + count2);
	System.out.println("Number of families with 3 children: " + count3);
	System.out.println("Number of families with 4 or more children: " + count4ormore);
	System.out.println("The most common number of children is " + mostCommon+ ".");

}
}

		// Gets the two command-line arguments
		//int T = Integer.parseInt(args[0]);
		//int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        	//Random generator = new Random(seed);  
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    

