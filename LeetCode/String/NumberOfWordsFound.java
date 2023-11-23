package LeetCode.String;

import java.util.Arrays;

public class NumberOfWordsFound{

    public static void main(String[] args){
        String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentence));
    }

    public static int mostWordsFound(String[] sentences){
        int[] total = new int[sentences.length];
        int count = 0;

        for(int i = 0; i <= sentences.length - 1; i++){
            System.out.println(sentences[i]);
            for(int j = 0; j <= sentences[i].length() - 1; j++){
                if(sentences[i].charAt(j) == ' ' || j == sentences[i].length() - 1){
                    count++;
                }
            }
            total[i] = count;
            count = 0;
        }
        int max = total[0];
        for(int k = 1; k < total.length; k++){
            if(total[k] > max){
                max = total[k];
            }
        }
        return max;
    }
}
