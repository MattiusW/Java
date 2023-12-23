import java.util.Arrays;

class TruncateSentence{
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        String newS = truncateSentence(s, 3);
        System.out.println("New String: " + newS);
    }

    public static String truncateSentence(String s, int k) {
        String sentence = "";
        String[] split = s.split(" ");
        int i = 0;
        
        do {
            sentence += split[i] + " ";
            i++;
        } while (i < k);
        
        return sentence.trim();
    }
}