
package basicsofjava;

public class patterns {
    public static void main(String[] args) {
        pattern1(5);



    }}
  /*     type 1 (small to big *)
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    } */

  /* type 2 (squary stars)
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    } */

 /*   // type 3 star pattern big to small
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    } */
 /*   //Diamond Problem done by Badal Pundir ^_^
    static void pattern2() {
        int n = 4;
        int i = 1;
        for (int row = 1; row <= n; row++) {

            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            i++;
            for (int j = 1; j <= row*2-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
// rev
        n--;
        i = n;
//        n--;
        for (int row = n; row >= 1; row--) {

            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            i--;
            for (int j = 1; j <= row*2-1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    } */

 /*    static void pattern3(int n) {
        int rows = 4; // Number of rows in the pattern
        for (int i = 1; i <= rows; i++) {
            // Print left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces
            for (int j = 1; j <= 2 * (rows - i); j++) {
                System.out.print(" ");
            }
            // Print right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    // type 4 numbering type
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }


}
 

 // Online Java Compiler
// Use this editor to write, compile and run your Java code online

  -----------------------------// DIAMOND PATTERN UPPER/LOWER ---------------------------


class Main {
    public static void main(String[] args) {
         int n = 4;
        for (int i=1; i<=n; i++) {
            for (int j=1 ; j<=n-i ; j++){   //n-1 space hai 
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){        //2*i-1 star print hore
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for (int i = n; i>=1; i--){
            for (int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++ ){
                System.out.print ("*");
            }
            System.out.println();
        }
    }}}

    
DIAMOND PATTERN IN SIMPLE BY USING Repeat ----------------------------  

       int n = 4;

for (int i = 1; i <= n; i++) {
    System.out.print(" ".repeat(n - i));           //space
    System.out.println("*".repeat(2 * i - 1));      //star print
}

for (int i = n - 1; i >= 1; i--) {
    System.out.print(" ".repeat(n - i));
    System.out.println("*".repeat(2 * i - 1));
}


    
--------------------------next - in simple way------------------------------------ 
*
**
***
****
*****
****
***
**
*


    int n = 5;
for (int i=1; i<=n; i++){
    System.out.println ("*".repeat (i));
 
}
for (int i=n-1; i>=1 ; i--){
    System.out.println ("*".repeat (i));
}


    -------------------------diamond--------upper - lower pyramid -----------------




    int n = 10;

    for (int i = 1; i <= n; i++) {
        System.out.print("".repeat(n - i));
        System.out.println("*".repeat(2 * i - 1));
    }
    
    for (int i = n - 1; i >= 1; i--) {
        System.out.print("".repeat(n - i));
        System.out.println("*".repeat(2 * i - 1));
    }
    }}
    
    

    -------------------another method ---------------------
    
             int n = 10;
    
    for (int i = 1; i <= n; i++) {
        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    for (int i = 9 ; i >= 1; i--) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
        }}


        
    
    --------------------mirror type ----------------------------------

    *            *
    **          **
    ***        ***
    ****      ****
    *****    *****
    ******  ******
    **************
    ******  ******
    *****    *****
    ****      ****
    ***        ***
    **          **
    *            *

    int n = 7;
for (int i=1; i<=n ; i++){
    System.out.print("*".repeat(i));
    System.out.print(" ".repeat(2*(n-i)));
    System.out.println("*".repeat(i));
}
for (int i=n-1; i>=1; i--){
    System.out.print("*".repeat(i));
    System.out.print(" ".repeat(2*(n-i)));
     System.out.println("*".repeat(i));
}}}


*/