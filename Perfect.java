/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int usr_input = Integer.parseInt(args[0]);
		int sum_devisors = 0;
		String output = usr_input + " is a perfect number since " + usr_input + " = ";
		
		for(int i=1; i<usr_input; i++){
			if(usr_input % i == 0){
				sum_devisors += i;
				output += (i + " + ");
			}
		}
		output = output.substring(0, output.length()-3);  //removing the last " + "
		
		if(sum_devisors != usr_input){
			//User input is a perfect number
			output = usr_input + " is not a perfect number";
		} 

		System.out.println(output);
	}
}
