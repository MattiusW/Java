package Algorithm;

public class Palindrome {
    
    public static boolean isPalindrome(String text){
        String reserved = "";

        for (int i = text.length() - 1; i >= 0; i--){
            reserved += text.charAt(i);
        }
        
        String palOne = text.toUpperCase();
        String palTwo = reserved.toUpperCase();
    
        if (palOne.equals(palTwo))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
