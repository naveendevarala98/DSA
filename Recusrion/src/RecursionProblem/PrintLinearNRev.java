package RecursionProblem;

public class PrintLinearNRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printLinear(10,1);

	}
	
	static void printLinear(int i, int n) {
		if(i<n)
			return ;
		
		System.out.println(i);
		printLinear(--i,n);
	}

}
