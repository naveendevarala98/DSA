package RecursionProblem;

public class PrintLinearN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printLinear(1,10);

	}
	
	static void printLinear(int i, int n) {
		if(i>n)
			return ;
		
		System.out.println(i);
		printLinear(++i,n);
	}

}
