package LeetCode;

public class ReverseString {
    
    public static void main(String[] args){

        char[] table = {'H', 'e', 'l', 'l', 'o'};
        reserveString(table);
        System.out.println(table);
        
    }

    public static void reserveString(char[] s){
        for(int i = s.length - 1; i >= 0; i--){
            System.out.println("i: " + s[i] + " :index: " + i);
            for(int j = s.length - 1; j >= i; j--){
                System.out.println("j: " + s[j] + " :index: " + j);
                char temp = s[j];
                s[j] = s[i];
                s[i] = temp;
            }
        }
    }

}
