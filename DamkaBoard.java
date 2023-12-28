/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int num = Integer.parseInt(args[0]); 
	for(int i=num-1; i>=0; i--){
	
	}
	for(int s = 0;s<num;s++){
		if (i%2==0){
		System.out.print("* ");
		}
		else {
			System.out.print(" *");
		}
	}
	System.out.println();
	}
}
