package RecursionProblem;
import java.util.List;
import java.util.ArrayList;

public class RatMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a[][]= {{1,0,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
		int[][] vis = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				vis[i][j]=0;
			}
		}
		int[] di= {1,0,0,-1};
		int[] dj= {0,-1,1,0};
		List<String> ans = new ArrayList<>();
		if(a[0][0]==1)
			solve(0,0,a,n,ans,"",vis,di,dj);
		if(ans.size()>0) {
			
			for(int i=0;i<ans.size();i++) {		
				System.out.println(ans.get(i));
			}
		
		}else {		
			System.out.print("-1");
		}
		

	}
	
	static void solve(int i, int j, int[][] a,int n, List<String> ans, String move,int[][] vis, 
			int[] di, int[]dj) {
		if(i==n-1 && j==n-1) {
			ans.add(move);
			return;
		}
		
		String dir="DLRU";
		for(int ind=0;ind<4;ind++) {
			int nexti = i+di[ind];
			int nextj = j+dj[ind];
			if(nexti>=0 && nextj>=0 && nexti<n&&nextj<n&&vis[nexti][nextj]==0&&a[nexti][nextj]==1) {
				vis[i][j]=1;
				solve(nexti,nextj,a,n,ans,move+dir.charAt(ind),vis,di,dj);
				vis[i][j]=0;
			}
		}
		
	}

}
