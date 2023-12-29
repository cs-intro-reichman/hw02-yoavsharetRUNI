/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int MAX_RAND_VAL = 10; // range is [0, 10)
		int new_rand = (int)(Math.random() * MAX_RAND_VAL);
		int last_rand_val = -1;
		do {
			last_rand_val = new_rand;
			System.out.print(last_rand_val + " ");
			// generate new random number
			new_rand = (int)(Math.random() * MAX_RAND_VAL);
		} while (new_rand >= last_rand_val);
	}
}
