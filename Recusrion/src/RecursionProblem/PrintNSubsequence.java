package RecursionProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintNSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		n=in.nextInt();
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		ArrayList<Integer> l = new ArrayList<>();
		printSub(0,a,l,n);
	}
	
	static void printSub(int i, int[] a, ArrayList<Integer> l, int n) {
		if(i==n) {
			System.out.println(l.toString());
			return;
		}
		
		l.add(a[i]);
		printSub(i+1, a, l, n);
		l.remove(l.size()-1);
		printSub(i+1, a, l, n);
	}

}
