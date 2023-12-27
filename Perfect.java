/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int num = Integer.parseInt(args[0]); 
	int count = 0;
	String exercise = " = ";
	for (int i =1; i<num; i++ ){
		if(num%i==0){
			if(count ==0){
				exercise+= i;
				count+=i;
			}
			else {
				count+=i;
				exercise += " + " + i; 
			}
			
		}
	}
	if(count ==num){
		System.out.println(num +" is a perfect number since "+ num + exercise);
	}
	else 
		System.out.println(num + " is not a perfect number");
		}
}
