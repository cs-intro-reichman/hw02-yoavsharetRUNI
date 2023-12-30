/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int input_board_dimensions = Integer.parseInt(args[0]);

		for(int i = 0; i<input_board_dimensions; i++){
			String output_token = (i % 2 == 0) ? "* ": " *";
			for(int j = 0; j<input_board_dimensions; j++){
				System.out.print(output_token);
			}
			System.out.println();
		}
	}
}
