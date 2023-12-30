/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int num_of_experiments = Integer.parseInt(args[0]);
		int stats_2_children = 0, stats_3_children = 0, stats_4p_children = 0;
		int total_num_of_children = 0;

		for(int i=0; i<num_of_experiments; i++){
			// Execute OneOfEach
			boolean boy_flag = false, girl_flag = false;
			int num_of_childern = 0;

			// rand gender logic: (0, 2] - 0: boy; 1: girl
			do {
				// rand kid gender
				if((int)(Math.random()*2) == 0){
					// a boy was born
					boy_flag = true;
				} else {
					girl_flag = true;
				}
				num_of_childern++;
			} while(!boy_flag || !girl_flag);
			
			// update stats
			total_num_of_children += num_of_childern;
			switch (num_of_childern) {
				case 2:
					stats_2_children++;
					break;
				case 3:
					stats_3_children++;
					break;
		
				default:
					stats_4p_children++;
					break;
			}
		}

		// calc and output avg
		double avg = (double)total_num_of_children/num_of_experiments;
		System.out.println("Average: " + avg +  " children to get at least one of each gender.");

		// output final stats
		System.out.println("Number of families with 2 children: " + stats_2_children);
		System.out.println("Number of families with 3 children: " + stats_3_children);
		System.out.println("Number of families with 4 or more children: " + stats_4p_children);

		// find and output common group
		if(stats_2_children > stats_3_children){
			if(stats_2_children > stats_4p_children){
				System.out.println("The most common number of children is 2.");
			} else{
				System.out.println("The most common number of children is 4 or more.");
			}
		} else if(stats_3_children > stats_4p_children){
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}
	}
}
