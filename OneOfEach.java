
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	boolean IsGiral = false;
	boolean IsBoy = false; 
	double r = Math.random();
	int count = 0;
	while (IsGiral== false || IsBoy ==false){
		if (r>0.5){ //if the random number generated is more then 0.5 it's a boy
			System.out.print("b ");
			IsBoy = true;
		}
		else{
			System.out.print("g ");
			IsGiral = true;
		}
		count++;
		r = Math.random();
	}
	System.out.println();
	System.out.println("You made it... and you now have "+count + " children");
	}
}
