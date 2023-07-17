package RecursionProblem;

import java.util.Scanner;

public class Sudoku {

	public static void main(String[] args) {

		/*to read input form user
		 * char[][] board = new char[9][9]; Scanner sc =new Scanner(System.in); for(int
		 * i=0;i<9;i++) { for(int j=0;j<9;j++) { board[i][j] = sc.next().charAt(0);
		 * System.out.print(board[i][j]); } System.out.println(); }
		 */
		
		char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                };
		solve(board);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	static boolean solve(char[][] board) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j]=='.') {
					for(char p='1';p<='9';p++)
						if(isValid(i,j,board,p)) {
							board[i][j] =p;
							if(solve(board)==true) {
								return true;
							}else {
								board[i][j]='.';
							}
						}
					return false;
				}
			}
		}
		return true;
	}
	
	static boolean isValid(int i, int j, char[][] board, char p) {
		for(int d=0;d<9;d++) {
			if(board[i][d] == p) {
				return false;
			}
			
			if(board[d][j]==p) {
				return false;
			}
			
			if(board[3*(i/3)+d/3][3*(j/3)+d%3]==p) {
				return false;
			}
		}
		return true;
	}

}
