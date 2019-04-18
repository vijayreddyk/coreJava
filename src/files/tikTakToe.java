package files;

public class tikTakToe {

	public static void main(String[] args) {
		char board[][] = new char[3][3];
		char term = 'O';
		while(true) {
			if(isBoardFilled(board)) {
				System.out.println("Winner is not determined");
				break;
			}
			else {
				fillBoard(board,term);
				System.out.println("========");
				printBoard(board);
				if(checkForWinners(board,term)) {
					System.out.println("*********|| "+term+" ||***********\n"
							+ "wins the game");
					break;
				}
				if(term=='X')
					term = 'O';
				else
					term = 'X';
			}
		}
	}
	private static boolean checkForWinners(char[][] board, char term) {
		int count = 0;
		for(int i=0;i<3;i++) {
			count = 0;
			for(int j=0;j<3;j++) {
				if(board[i][j]!=term)
					break;
				else
					count++;
			}
			if(count==3)
				return true;
		}
		for(int i=0;i<3;i++) {
			count = 0;
			for(int j=0;j<3;j++) {
				if(board[j][i]!=term)
					break;
				else
					count++;
			}
			if(count==3)
				return true;
		}
		count = 0;
		for(int i=0;i<3;i++) {
			if(board[i][i]!=term)
				break;
			else
				count++;
		}
		if(count==3)
			return true;
		count = 0;
		int c = 2;
		for(int i=0;i<3;i++) {
			if(board[i][c]!=term)
				break;
			else {
				count++;
				c--;
			}
		}
		if(count == 3)
			return true;
		return false;
	}
	private static void fillBoard(char[][] board, char term) {
		while(true) {
			int row = (int) (Math.random()*3);
			int col = (int) (Math.random()*3);
			if(board[row][col]=='\u0000') {
				board[row][col] = term;
				return;
			}
		}
	}
	private static void printBoard(char[][] board) {
		for(int i=0;i<3;i++) {
			System.out.print("|");
			for(int j=0;j<3;j++) {
				if(board[i][j]=='\u0000')
					System.out.print(" ");
				else 
					System.out.print(board[i][j]);
				System.out.print("|");
			}
			System.out.println();
		}
	}



	private static boolean isBoardFilled(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]=='\u0000')
					return false;
			}
		}
		return false;
	}

}
