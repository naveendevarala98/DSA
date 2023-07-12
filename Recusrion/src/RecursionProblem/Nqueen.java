package RecursionProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		List<List<String>> queen = solveQueens(n);
		int i=1;
		for(List<String> it:queen) {
			System.out.println("Arrangements "+i);
			for(String s : it) {
				System.out.println(s);
			}
			System.out.println();
			i+=1;
			
		}
	}
	
	
	static List<List<String>> solveQueens(int n){
		char[][] board = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][i]='.';
			}
		}
		
		List<List<String>> res = new ArrayList<List<String>>();
		int[] leftRow = new int[n];
		int[] upperDiagonal = new int[2*n-1];
		int[] lowerDiagonal = new int[2*n-1];
		solve(0,board,leftRow,upperDiagonal,lowerDiagonal,res);
		return res;
	}
	
	static void solve(int col, char[][] board, int[] leftRow, int[] upperDiagonal, int[] lowerDiagonal, 
			List<List<String>> res) {
		System.out.println("before base "+col);
		if(col==board.length) {
			System.out.println("inside base "+col);
			res.add(construct(board));
			return;
		}
		
		for(int row=0;row<board.length;row++) {
			if(leftRow[row]==0 && upperDiagonal[(board.length-1)+(col-row)] == 0 &&
					lowerDiagonal[row+col]==0) {
				
				board[col][row] = 'Q';
				leftRow[row] =1;
				upperDiagonal[(board.length-1)+(col-row)] =1;
				lowerDiagonal[row+col] =1;
				solve(col+1,board,leftRow,upperDiagonal,lowerDiagonal,res);
				leftRow[row] =0;
				upperDiagonal[(board.length-1)+(col-row)] =0;
				lowerDiagonal[row+col] =0;
				board[col][row]='.';
				
			}
			System.out.println("out if row"+row);
			System.out.println("out if cok"+col);
		}
	}
	
	static List<String> construct(char[][] board){
		List<String> res = new LinkedList<String>();
		for(int i=0;i<board.length;i++) {
			String s =new String(board[i]);
			res.add(s);
		}
		
		return res;
	}
}
