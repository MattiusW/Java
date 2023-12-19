public class ShuffleString {
    
    public static void main(String[] args){
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

    }

    public static String restoreString(String s, int[] indices) {
        String shuffle = "";
        char[] word = new char[s.length()];

        for(int i = 0; i < s.length(); i++){
            word[indices[i]] = s.charAt(i);
        }

        for(int j = 0; j < word.length; j++){
            shuffle += word[j];
        }

        return shuffle;
    }
}
