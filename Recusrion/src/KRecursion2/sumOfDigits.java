package KRecursion2;

public class sumOfDigits {
    static int rev=0;

    public static void main(String[] args){
      //  System.out.println(sumOf(505));
      //  rev(123);
     //   System.out.println(rev);
        //pall
     //   System.out.println(pall(123,0));

        //count zero
     //   countZ(341);
       // System.out.println(rev);

        System.out.println(countZ1(30401,0));
    }

    public static int sumOf(int n){
        if(n<=0){
            return 0;
        }
        int r=n%10;
        int s = sumOf(n/10);
        return r+s;
      //  return n%10+sumOf(n/10);

    }

    //reverse
    public static void rev(int n){
        if(n<=0){
            return ;
        }

         rev = rev*10+n%10;
        rev(n/10);
    }

    //pallindrome:
    public static boolean pall(int n){
        //reverse the number and check
      //  return n== rev(n);
        return true;
    }

    //count zero in number
    public static void countZ(int n){
        if(n<=0){
            return ;
        }
        if(n%10==0){
            rev=rev+1;
        }
        countZ(n/10);

    }

    //count zero in number
    public static int countZ1(int n, int c){
        if(n==0){
            return c;
        }
        if((n%10) ==0){
            return countZ1(n/10,c+1);
        }
           return countZ1(n/10,c);


    }
}
