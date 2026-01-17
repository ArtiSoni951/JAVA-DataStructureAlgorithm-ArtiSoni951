import java.util.*;
public class JavaLinearSearch {
    
    public static int linearSearch( int numbers[],int key){

         for ( int i=0; i<numbers.length;i++){
           if(numbers[i] == key){
                 return i;
           }
       }

         return -1; //means that element not found
    }
    public static void main (String args[]){

        int number[] = { 2,4,6,8,10,12,14,16};
        
        int key = 10;
        //linear search

        // int index = linearSearch(number, key);
        // if ( index == -1){
        //     System.out.println("Key not found ");
        // }
        // else{
        //     System.out.println("Key found at index: " + index);
        // }
   
 
 System.out.println("key found at index: " + linearSearch(number, key));
    }
}
