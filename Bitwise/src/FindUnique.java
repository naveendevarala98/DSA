public class FindUnique {
    public static void main(String[] args) {
        int[] arr ={2,2,3,4,5,4,3};
        System.out.println(findUniq(arr));
    }

    private static int findUniq(int[] a){
        int unique =0;
        for(int i =0;i<a.length;i++){
            unique = unique ^ a[i];
        }
        return unique;
    }
}
