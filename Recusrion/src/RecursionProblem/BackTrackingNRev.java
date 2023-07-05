package RecursionProblem;

public class BackTrackingNRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revBackTrack(1,3);

	}
	
	static void revBackTrack(int i, int n) {
		if(i>n)
			return;
		revBackTrack(i+1,n);
		System.out.println(i);
		
	}

}
