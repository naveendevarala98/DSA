package KRecursion2;

import java.util.ArrayList;
import java.util.List;

public class recArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,8,5,3};
        boolean ans = sortedArr(a,0);
     //   System.out.println(ans);
      //  System.out.println(linearSearch(a,100,0));

      //  System.out.println(findAllIndex(a,3,0, new ArrayList<>()).toString());
        System.out.println(findAllIndexInArray(a,3,0).toString());
    }

    public static boolean sortedArr(int[] a, int i){
        if(i==a.length-1){
            return true;
        }

        if(a[i]<a[i+1]){
            return sortedArr(a,i+1);
        }else{
            return false;
        }

    }

    public static boolean linearSearch(int[] a, int t, int i){
        if(i==a.length){
            return false;
        }
        if(a[i]==t){
            return true;
        }
        return linearSearch(a, t, i+1);
    }

    public static int findIndex(int[] a, int t, int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==t){
            return i;
        }
        return findIndex(a, t, i+1);
    }

    public static ArrayList<Integer> findAllIndex(int[] a, int t, int i, ArrayList<Integer> list){
        if(i==a.length){
            return list;
        }
        if(a[i]==t){
            list.add(i);
        }
        return findAllIndex(a, t, i+1, list);
    }

    public static ArrayList<Integer> findAllIndexInArray(int[] a, int t, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==a.length){
            return list;
        }
        if(a[i]==t){
            list.add(i);
        }
        ArrayList<Integer> ans = findAllIndexInArray(a, t, i+1);
        list.addAll(ans);
        return list;
    }
}
