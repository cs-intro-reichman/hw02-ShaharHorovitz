/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
	String word = args[0];
	String reverseWord = "";
	int midword = word.length()/2 -1;
	for (int i=word.length()-1; i>=0; i--){
	reverseWord = reverseWord + word.charAt(i);
	}
	System.out.println(reverseWord);
	int middleChar = word.length()/2;
	System.out.println("The middle charcter is: " + word.charAt(middleChar));
	}
}
