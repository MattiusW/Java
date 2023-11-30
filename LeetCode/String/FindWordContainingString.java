import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FindWordContainingString {
    
    public static void main(String[] args){
        String[] words = {"abc","bcd","aaaa","cbc"};  
        char x = 'c';  
        findWordsContaining(words, x);
        System.out.println(findWordsContaining(words, x));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList list = new ArrayList<>();

        for (int i = 0; i < words.length; i++)
        { 
          for(int j = 0; j <= words[i].length() - 1; j++){
              if(x == words[i].charAt(j)){
                list.add(i);
                break;
              }
          }
        }
        return list;
    }
}
