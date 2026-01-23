public class JavaLinearSearchThird {
    public static boolean search(String name, char target){
       if (name.length() == 0){
        return false;
       } 

       for( int i=0 ; i< name.length() ; i++){
            if( target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        String name = "kunal";
        char target = 'u';
        System.out.println(search(name, target));

        
    }
}
