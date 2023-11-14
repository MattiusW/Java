package Spoj;

import java.util.HashMap;
import java.util.Map;

public class RomanToString {
    
    public static void main(String[] args){
        System.out.println(romanToInt("VII"));

    }

    public static int romanToInt(String s){
        Map<Character, Integer> m = new HashMap<>();
        int roman = 0;

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            if(i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))){
                roman -= m.get(s.charAt(i));
            }
            else{
                roman += m.get(s.charAt(i));
            }
        } 

        return roman;
    }
}
