
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy_flag = false, girl_flag = false;
		int num_of_childern = 0;

		// rand gender logic: (0, 2] - 0: boy; 1: girl
		do {
			// rand kid gender
			if((int)(Math.random()*2) == 0){
				// a boy was born
				System.out.print("b ");
				boy_flag = true;
			} else {
				System.out.print("g ");
				girl_flag = true;
			}
			num_of_childern++;
		} while(!boy_flag || !girl_flag);
		System.out.println();
		System.out.println("You made it... and you now have " +  num_of_childern  + " children.");
	}
}
