package com.problems;

import java.util.*;

public class TwoStacks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       // int t = s.nextInt();
        //  for (int i = 0; i < t; i++) {
        int n = s.nextInt();
        int m = s.nextInt();
        int x = s.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int j = 0; j < n; j++) {
            a[j] = s.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = s.nextInt();
        }
        System.out.println(twoStackGame(0,  a, b, 0, x) - 1);
        // }
    }

    private static int twoStackGame(int sum, int[] a, int[] b, int count, int total){
        if(sum> total){
            return count;
        }
        if(a.length ==0 || b.length == 0){
            return count;
        }
        int ans1 = twoStackGame(a[0]+sum, Arrays.copyOfRange(a,1,a.length), b, count+1, total);
        int ans2 = twoStackGame(b[0]+sum, a, Arrays.copyOfRange(b,1,b.length), count+1, total);

        return Math.max(ans1,ans2);
    }

}
