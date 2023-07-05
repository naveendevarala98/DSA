package RecursionProblem;

public class PrintNNames {
	
	public static void main(String[] args) {
		printnames(5);	
	
	}
	
	static void printnames(int times) {
		if(times==0) {
			return;
		}
		System.out.println("Name1");
		printnames(--times);
		
	}
	
	

}
