package basicsofjava;
import java.util.*;

public class basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        boolean ans = isprime(n);
//        System.out.println(ans);

/*    Reverse a number
      int rev= 0;
       while (n>0){
           int rem=n%10;
           rev=rev*10+rem;
           n/=10;
       }
        System.out.println(rev);
        */

/*
        //        for maximum value
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int max= a;
        if(b>max){
            max=b;
        }
        if(c>b){
            max=c;
        }
        System.out.println(max); */

/*
//        for alphabet check
        char ch= sc.next().trim().charAt(0);
        System.out.println(ch);
        if(ch>='a' && ch<='z'){
            System.out.println("lower case");
        } else {
            System.out.println("Upper case");
        }
        */

 /*
//   Fibbonaci series
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        // int  count =2;

//       with for loop
        for (int count = 2; count <= n; count++) {
            int temp= b;
            b=b+a;
            a=temp;

//        with while loop
//        while(count<=n){
//            int temp= b;
//            b=b+a;
//            a=temp;
//            count++;
//        }
            System.out.print(b+ " ");

        }  */

 /*
        // Occurence of digits
        int n= 1733893332;
        int count = 0;
        while (n>0){
            int rem=n%10;
            if (rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
*/

/*
//        Reversing a number
        int n= 1234567;
        int ans=0;
         while(n>0){
             int rem= n%10;
             n /= 10;
             ans= ans*10+rem;

         }
        System.out.println(ans);

 */

/*
    // switch statments

        String fruits= sc.next();

          // old switch syntax
          switch (fruits) {
                case "apple":
                    System.out.println("red fruit");
                    break;
              case "orange":
                  System.out.println("orange fruit");
                  break;
                case "mango":
                    System.out.println("yellow fruit");
                    break;
                default:
                    System.out.println("invalid fruit name");
                    System.out.println("enter fruit");

            } */

/*        //enhanced switch
        switch (fruits) {
            case "apple" -> System.out.println("red fruit");
            case "mango" -> System.out.println("yellow fruit");
            case "orange" -> System.out.println("orange fruit");
            default -> {
                System.out.println("invalid fruit name");
                System.out.println("enter fruit");
            }
        }  */

 /*
        //nested switch
        String fruits= sc.next();
        int num= sc.nextInt();

        switch (fruits) {
            case "apple":
                System.out.println("red fruit");
                break;
            case "orange":
                System.out.println("orange fruit");
                break;
            case "mango":
                System.out.println("yellow fruit");
                break;
            case "grapes":
                switch(num){
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("2");
                        break;
                    default:
                        System.out.println("enter valid num");
                }
            default:
                System.out.println("invalid fruit name");


        } */

    }

/*
    // prime number
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c*c>n;
    }*/

   /*  prime number
       if(n<=1){
        System.out.println("not a prime number");
    }
        for (int i=2; i<=Math.sqrt(n);i++){
        if(n%i == 0){
            System.out.println("not a prime");
        } else {
            System.out.println("A prime number ");
        }
    } */

    /*  even or odd

    for (int i=0; i<size;i++){
        if (arr[i]%2==0){
            System.out.println(arr[i] + " is even ");
        } else {

            System.out.println(arr[i] + " is odd ");

        }
    } */

    /*    // palindrome

        static boolean ispalindrome(int n){
        int dup=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==dup) {
            return true;
        } else return false; */

    /*    //armstrong numbers
    static boolean armstrong(int n){
        int dup=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum += (rem*rem*rem);
            n/=10;
        }
        return dup == sum;
    } */

  /*  // Here i have done multiple things
    // 1.added the sum of digits of array and print it new array by mapping
    // 2. find the max and min value from new array and print their differnce

    int[] arr = {23, 25, 65, 78, 92};
    int[] newarr = new int[arr.length];

  for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        int num = arr[i];
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        newarr[i] = sum;
    }
        System.out.println(Arrays.toString(newarr));
    // System.out.print(sum + " ");


    // continuing with max and min value
    int min = newarr[0];
    int max = newarr[0];
    int j;
        for (j = 0; j < newarr.length; j++) {
        // System.out.println(newarr) // it maps the newarr from arr.
        if (newarr[j] > max) {
            max = newarr[j];
        }
        if (newarr[j] < min) {
            min = newarr[j];
        }
    }

    int differnce = max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(differnce); */

 /* // checking for primary number also with range.
   Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println(isprime(n));
//       isprime(n);

        // to check in between range
        for (int i=2; i<= 20; i++){
           if (isprime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isprime(int n){
        if (n<=1){
           return false;
        }
        for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n%i==0){
               return false;
            }
        }
        return true;
    }

  */

    /* minumum between given range
     int[] arr= {1,15,25,19,9,11,14,19,2};
        int ans= minmax(arr,2,6);
        System.out.println(ans + " is minimum");

    }
    static int minmax(int[] arr, int start, int end){
        int min= arr[start];
        for (int i = start; i <= end ; i++) {
            if(arr[i]< min){
            min=arr[i];
            }
        }
        return min;
     */

    /* // Arsmstrong numbers
    Scanner in = new Scanner(System.in);
//       int num=in.nextInt();
//        System.out.println(isarmstrong(num));
        // finding armstrong numbers in between range
        for (int i = 100; i <1000 ; i++) {
            if (isarmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isarmstrong(int num){
        int original = num;
        int sum = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            int cube = rem * rem * rem;
            sum += cube;

        }
        return sum == original;
    }
     */

    /*
    // Linear search (target found)

    public class Temporray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 14;
      int ans =  linearsearch(arr,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if (arr.length==0){
            //   return -1; // returns false if target not found.
        }
        // we can also return true or false for this.
        for (int i = 0; i <arr.length ; i++) {
            int element= arr[i];
            if (element==target){
               // return i; // for returning the index of the target
            //return element; // returns the actual target
            }
        }
        return -1;
    }
}
     */

/*

public class Temporray {
    public static void main(String[] args) {
       // searching in strings
        String name= "Aniket";
        char target = 'k';
        System.out.println( stringsearch( name,target));
    }
    static boolean stringsearch(String name, char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i <name.length() ; i++) {
        if (target== name.charAt(i)){
            return true;
        }
        }
        return false;
    }
}
 */
}
