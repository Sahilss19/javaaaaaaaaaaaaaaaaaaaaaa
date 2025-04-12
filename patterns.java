
package basicsofjava;

public class patterns {
    public static void main(String[] args) {
        pattern1(5);



    }
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
    } */

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
