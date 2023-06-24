package BS1DArray;

import java.util.Scanner;

public class FindPeakElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		n= in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		System.out.println(findPeakElement(a));

	}
	
	public static int findPeakElement(int[] a) {
        int n=a.length;
        if(n==1)return 0;
        if(a[0]>a[1])return 0;
        if(a[n-1]>a[n-2])return n-1;
        int low=1;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]){
                return mid;
            }else if(a[mid]>a[mid+1]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
        
        
    }

}
