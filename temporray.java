import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Scanner;

public class Temporray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice: ");
       String input= sc.next();

        int pie = (int) 3.14;
        int r = 5;
        int ac = pie * (r * r);
       // r = sc.nextInt();


        int l = 5;
        int b = 10;
        int ar = l * b;

        switch (input) {
            case "A":
                System.out.println("Area of circle " + ac);
                break;
            case "B":
                System.out.println("Area of reactangle " + ar);
                break;
            default:
                System.out.println("This is default");
        }
    }
}

