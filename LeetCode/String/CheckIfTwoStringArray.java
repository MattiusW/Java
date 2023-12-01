public class CheckIfTwoStringArray {
    
    public static void main(String[] args){
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordOne = "";
        String wordTwo = "";
        
        for(int i = 0; i <= word1.length - 1; i++){
            wordOne += word1[i];
        }
        
        for(int j = 0; j <= word2.length - 1; j++){
            wordTwo += word2[j];
        }

        if(wordOne.equals(wordTwo)){
            return true;
        }
        else{
            
            return false;
        }
    }

}
