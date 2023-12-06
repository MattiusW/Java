package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortMatrix {

    public static void main(String[] args){
        int[][] matrix = {{2,3,1,1}, {2,2,1,2}, {1,1,1,2}};
        System.out.println("Original Matrix: " + Arrays.deepToString(matrix));
        int[][] newMat = diagonalSort(matrix);
        System.out.println(Arrays.deepToString(newMat));
    }

    public static int[][] diagonalSort(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= mat.length - 1; i++){
            for(int j = 0; j < mat[i].length; j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println("List : " + list);
        int a = 0;
        for (int k = 0; k <= mat.length - 1; k++){
            for(int l = 0; l < mat[k].length; l++){
                mat[k][l] = list.get(a);
                a++;
            }
        }
        
        return mat;
    }   
}
