import java.util.Arrays;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {
        String str = "is2 zdanie4 This1 a3";
        System.out.println(sortSentence(str));
    }

    public static String sortSentence(String s) {
        String [] sentence = s.split(" ");
        for(int i = 0; i < sentence.length; i++){
            System.out.println(sentence[i].charAt((sentence[i].length() - 1)));
            System.out.println(sentence[i].substring(0, sentence[i].length() - 1));
        }

        return s;
    }
}
