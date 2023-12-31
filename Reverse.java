/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String usr_input = args[0];
		int input_length = usr_input.length();

		// prints reversed usr input
		for(int i = input_length-1; i>=0; i--){
			System.out.print(usr_input.charAt(i));
		}
		System.out.println();

		//finding the middle char, and outputs it
		int middle_index = input_length % 2 == 0 ? (input_length/2)-1 :
						((input_length+1)/2)-1;
		System.out.println("The middle character is " + 
							usr_input.charAt(middle_index));
	}
}
