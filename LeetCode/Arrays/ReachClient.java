package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReachClient{

    public static void main(String[] args){
        int[][] account = {{1,2,3}, {4,5,6}, {7,8,9}, {1,2,3}};
        System.out.println(maximumWealth(account));
    }

    public static int maximumWealth(int[][] accounts) {
        int count = 0;
        int[] table = new int[accounts.length];

        for(int i = 0; i <= accounts.length - 1; i++){
            for(int j = 0; j <= accounts[i].length - 1; j++){
                //System.out.println(accounts[i][j] + accounts[i][j]);
                count += accounts[i][j];
            }
            table[i] += count;
            count = 0;
            System.out.println(Arrays.toString(table));
        }

        int max = table[0];
        for (int k = 1; k < table.length; k++){
            if(max < table[k]){
                max = table[k];
            }
        }

        return max;
    }
}