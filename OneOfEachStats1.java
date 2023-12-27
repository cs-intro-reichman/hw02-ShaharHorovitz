/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int t = Integer.parseInt(args[0]); //number of expiremnts
	int count2 = 0; 
	int count3 = 0; 
	int count4ormore = 0;
	double avgOfKids = 0;
	for (int i =0; i<t; i++){
		boolean IsGiral = false;
		boolean IsBoy = false; 
		double r = Math.random();
		int count = 0;
		while (IsGiral== false || IsBoy ==false){
		if (r>0.5){ //if the random number generated is more then 0.5 it's a boy
			//System.out.print("b ");
			IsBoy = true;
		}
		else{
			//System.out.print("g ");
			IsGiral = true;
		}
		count++;
		r = Math.random();
	
	}
	avgOfKids += (double) count;
	if (count ==2){
			count2++;
		}
	if (count ==3){
			count3++;
		}
	if(count >= 4) {
			count4ormore++; 
		}
	}
	int mostCommon = 0;
	if(count2 > count3 && count2>count4ormore){
		mostCommon = 2; 
	}
	if (count3 >count2 && count3 > count4ormore){
		mostCommon = 3; 
	}
	if (count4ormore >count2 && count4ormore >count3){
		mostCommon = 4; 
	}
	System.out.println("Average: " +avgOfKids/t + " to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + count2);
	System.out.println("Number of families with 3 children: " + count3);
	System.out.println("Number of families with 4 or more children: " + count4ormore);
	}
}
