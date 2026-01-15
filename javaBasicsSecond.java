import java.util.*;
public class javaBasicsSecond {

    public static void printHelloWorld() {
        System.out.println("Hello, World!");
        return;
    }

    public static void calculateSum(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);  
    }
    public static void main(String[] args) {
        // byte b = 5;
        // b = (byte) (b * 2); // Explicit casting required
        // System.out.println("Byte value after multiplication: " + b);      
        // printHelloWorld(); //function call

        calculateSum(); //function call
    }   }