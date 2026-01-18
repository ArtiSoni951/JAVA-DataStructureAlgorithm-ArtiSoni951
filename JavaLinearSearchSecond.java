public class JavaLinearSearchSecond {


    public static boolean linearSearch( String words[],String key){
        for(int i=0 ; i< words.length ; i++){
            if(words[i].equals(key)){
                System.out.println("Key is found at index: " + i);
                return true;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "fig", "grape"};
        String key = "cherry";
        boolean result = linearSearch(words, key);
        
    }
}
