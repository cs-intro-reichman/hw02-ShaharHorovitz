/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// TODO: ident all the code below the main
	int num = Integer.parseInt(args[0]); 
	for(int i=0; i<num; i++){
		for(int s = 1;s<=num;s++){
			// TODO: ident this piece of code to the right
		if (i%2==0){
		System.out.print("* "); // TODO: ident this line to the right
		}
		else {
			System.out.print(" *");
		}
		}
			//
		System.out.println();
	}
	
	}
}
