import javax.management.BadBinaryOpValueExpException;

public class JavaPatterns {
    public static void main(String[] args) {
        
        //print star pattern
        // for(int i =1 ; i <= 4; i++){
        //     for(int j = 1 ; j <= i ;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

       // OUTPUT : *
         //        **
        //         ***
       //          ****

        //print inverted star pattern
        // int n =4 ;
        // for ( int line =1 ;line <= 4 ; line++){
        //     for(int star =1; star <= n -line+1 ; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //output : ****
        //         ***      
        //         **
        //         *


        //half pyramid pattern
        // int n = 4;
        // for(int i=1 ; i<= 4; i++){
        //     for(int j =1 ; j<= i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    // output: 1
    //         12       
    //         123
    //         1234


        //inverted half pyramid pattern
    //     int n = 4;  
    //     for(int i =1 ; i <= n ; i++){
    //         for(int j =1 ; j <= n - i + 1 ; j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    // }

    // output: 1234
    //         123      
    //         12
    //         1    



    //print character pattern


    // int n =4 ;
    // for (int i =1; i <= n ; i++){
    //     for(int j =1; j<= i;j++){
    //         char ch = (char) ('A' + i -1);
    //         System.out.print(ch);
    //     }
    //     System.out.println();
    // }

    // output:     A
    //             BB
    //             CCC
    //             DDDD

    int n =4 ;
    char  ch = 'A';
    for ( int line =1; line <= n ; line++){
        for ( int chars =1; chars <= line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }

    // output: A
    //         BC       
    //         DEF
    //         GHIJ 


    }}
