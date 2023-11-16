package LeetCode;

public class LengthofLastWord {
    
    public static void main(String[] args){
        String s = " I would fly to the moon ";
        System.out.println(lengthofLastWord(s));
    }

    public static int lengthofLastWord(String s){
        int count = 0;
        String nonSpace = s.trim(); //Remove white space on begin and end from string.   

        for(int i = nonSpace.length() - 1; i >= 0; i--)
        {   
            if(nonSpace.charAt(i) == ' ')
            {
                break;
            }
            else{
                count++;
            }            
        }
        System.out.println(nonSpace);
        return count;
    }

}
