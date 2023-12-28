package KRecursion2;

import java.util.*;

public class Csum {
    public static void main(String[] args) {
        int[] a={10,1,2,7,6,1,5};
        int t=8;
      //  csum(a,t,0,new ArrayList<>());
        Set<List<Integer>> ans = new HashSet<>();
        csum2(a,t,0,new ArrayList<>(), ans);
        List<List<Integer>> fa=new ArrayList<>(ans);
        System.out.println(fa);
    }

    private static void csum(int[] arr, int t, int index, List<Integer> ds){
        if(index==arr.length){
            if(t == 0){
                System.out.println(ds.toString());
            }
            return;
        }
        if(arr[index]<=t) {
            ds.add(arr[index]);
            csum(arr, t-arr[index], index , ds);
            ds.remove(ds.size() - 1);
        }
        csum(arr,t,index+1,ds);

    }

    private static void csum2(int[] a, int t, int index, List<Integer> ds, Set<List<Integer>> ans){
        if(t==0){
            List<Integer> news = new ArrayList<>(ds);
            Collections.sort(news);
            ans.add(new ArrayList<>(news));
         //   System.out.println(ans.toString());
            return;
        }
        if(index>=a.length){
          //  System.out.println(index);
            return;
        }


        if(a[index]<=t){
            ds.add(a[index]);
            csum2(a,t-a[index],index+1,ds,ans);
            ds.remove(ds.size()-1);
        }
            csum2(a,t,index+1,ds,ans);

    }
}
