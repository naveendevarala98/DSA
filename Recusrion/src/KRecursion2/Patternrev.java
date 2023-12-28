package KRecursion2;

public class Patternrev {

    public static void main(String[] args) {
      //  pattern1(5,0);
        pattern11Tria(5,0);
    }

//    private static void pattern1(int n, int i) {
//        if(i>n){
//            return;
//        }
//        for(int j=1;j<=n-i;j++){
//            System.out.print("* ");
//        }
//        System.out.println();
//        pattern1(n,i+1);
//    }

    private static void pattern11Tria(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            pattern11Tria(r,c+1);
        }else{
            System.out.println();
            pattern11Tria(r-1,0);
        }
    }

    private static void pattern11invTria(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){

            pattern11Tria(r,c+1);
            System.out.print("*");
        }else{

            pattern11Tria(r-1,0);
            System.out.println();
        }
    }
}
