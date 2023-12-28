/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
	int num = Integer.parseInt(args[0]); 
	for(int i=num; i>0; i--){
		for(int s = 1;s<=num;s++){
		if (i%2==0 || i ==num){
		System.out.print("* ");
		}
		else {
			System.out.print(" *");
		}
		}
		System.out.println();
	}
	
	}
}
