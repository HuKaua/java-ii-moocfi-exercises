
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String,String> hashmap){
        for (String text : hashmap.keySet()) {
            System.out.println(text);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for (String txt : hashmap.keySet()) {
            if (txt.contains(text)) {
                System.out.println(txt);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String txt: hashmap.keySet()) {
            if (txt.contains(text)) {
                System.out.println(hashmap.get(txt));
            }
        }
    }

}
