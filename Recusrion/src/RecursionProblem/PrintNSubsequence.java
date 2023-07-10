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
		System.out.println("Print subsequences whose sum is target");
		int target = 2;
		int add=0;
		
		printSumSub(0, a, l, n, target, add);
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
	
	static void printSumSub(int i, int[] a, ArrayList<Integer> l, int n, int target, int add) {
		if(i==n) {
			if(add==target)
			System.out.println(l.toString());
			return;
		}
		
		l.add(a[i]);
		add=add+a[i];
		printSumSub(i+1, a, l, n,target, add);
		l.remove(l.size()-1);
		add=add-a[i];
		printSumSub(i+1, a, l, n,target, add);
	}

}
