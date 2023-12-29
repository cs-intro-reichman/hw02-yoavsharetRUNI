/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int number_from_usr = Integer.parseInt(args[0]);
		
		for (int i = 1; i<=number_from_usr; i++){
			if(number_from_usr % i == 0){
				System.out.println(i); 
			}
		}
	}
}
