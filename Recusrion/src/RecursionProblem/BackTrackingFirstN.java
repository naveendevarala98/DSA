package RecursionProblem;

public class BackTrackingFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		linearN(3);

	}
	
	static void linearN(int i) {
		if(i<1)
			return ;
		
		linearN(i-1);
		System.out.println(i);
	}

}
