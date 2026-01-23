public class product {
    public static int multipy(int a , int b){
        int product = a * b ;
        return product;
    }
    
    public static void main(String[] args) {
       int ans = multipy( 3,5);
       System.out.println( " a * b = " +  ans); 
        ans = multipy(12, 23);
       System.out.println("a * b = " + ans );
    }
}
