/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int input_board_dimensions = Integer.parseInt(args[0]);

		for(int i = 0; i<input_board_dimensions; i++){
			if(i % 2 == 1){
				System.out.print(" ");
			}
			for(int j = 0; j<input_board_dimensions; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
