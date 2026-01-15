import java.util.*;
public class JavaBasicsThird {
    public static void main(String[] args) {
        // int a = 1;
        // int b = 5;
        
        // if(a>=b){
        //     System.out.println("a is largest of 2 "    );
        // }else{
        //     System.out.println("b is largest of 2 "    );
        // }
// Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt(); 
//         if(n%2==0){
//             System.out.println("Even Number");
//         }
//         else{
//             System.out.println("Odd Number");
//         }
// Scanner sc = new Scanner (System.in);

// int income = sc.nextInt();
// int tax ;

// if(income<50000){
//     tax = 0;
// }
// else if(income >= 50000 && income < 100000){
//     tax = (int)(0.2*income);
// }
// else{
//     tax = (int)(0.3*income);
// }
// System.out.println(" your Tax is: " + tax);
//     }

// int A = 1, B = 3, C = 6;
//  if ((A >= B) && (A <=C)){
//     System.out.println("largest is A: " + A);
//  }
//  else if(B>=C){
//     System.out.println("largest is B: " + B);
//  }
//     else{
//         System.out.println("largest is C: " + C);
//     }   


//TERNARY OPERATOR
// int number = 4;

// String type =((number%2)==0)?"even":"odd";
// System.out.println(type);

// int marks = 85;

// String reportcard =marks>=33 ? "pass":"fail";
// System.out.println(reportcard);

//switch case
// int number = 2;
// switch(number){
//     case 1 : System.out.println("samosa");
//     break;
//     case 2 : System.out.println("burger");
//     break;
//     case 3 : System.out.println("pizza");
//     break;
//     default : System.out.println("invalid choice");   
// }
Scanner sc = new Scanner (System.in);
System.out.println("enter a :");
int A = sc.nextInt();
System.out.println("enter b :");
int B = sc.nextInt();
System.out.println("enter operator :");
char op = sc.next().charAt(0);
switch (op) {
    case '+':
        System.out.println("Sum: " + (A + B));  
        
        break;
    case '-':
        System.out.println("Difference: " + (A - B));
        break;
    case '*':
        System.out.println("Product: " + (A * B));  
        break;
    case '/':
        System.out.println("Quotient: " + (A / B));
        break;
        case '%':
        System.out.println("Remainder: " + (A % B));
        break;


    default: System.out.println("Invalid Operator");
       
}


}}