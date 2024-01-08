/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	// TODO no identations!!!!!
	public static void main (String[] args) {
	int minRandomNum = (int) (Math.random() * 11); //generates the first number
	System.out.print(minRandomNum);
	int nextRandom = (int) (Math.random() * 11); //generates the next number
	while (nextRandom >= minRandomNum){
	System.out.print(" " +nextRandom);
	minRandomNum = nextRandom;
	nextRandom = (int) (Math.random() * 11);
	//System.out.print(" " +nextRandom); 
	}
	}
}
