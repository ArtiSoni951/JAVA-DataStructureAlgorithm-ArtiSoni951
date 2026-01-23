import java.util.*;

public class JavaFunctions {

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
     return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // int calculatesum = sum(a, b);
        sum(a, b);
         System.out.println("sum is :" + sum(a,b));

    }
}
