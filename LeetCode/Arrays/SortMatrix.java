package LeetCode.Arrays;

import java.util.Arrays;

public class SortMatrix {

    public static void main(String[] args){
        int[][] matrix = {{2,3,1,1}, {2,2,1,2}, {1,1,1,2}};
        System.out.println("Original Matrix: " + Arrays.deepToString(matrix));
        int[][] newMat = diagonalSort(matrix);
        System.out.println(Arrays.deepToString(newMat));
    }

    public static int[][] diagonalSort(int[][] mat) {
        int temp = 0;
        for (int i = 0; i <= mat.length - 1; i++){
            for(int j = 1; j < mat[i].length; j++){
                int[][] newMatrix = new int[mat.length][mat[i].length];
                for(int k = 0; k < j; k++){
                    if(mat[i][k] < mat[i][j]){
                        temp = mat[i][k];
                        mat[i][j] = mat[i][k];
                        mat[i][k] = temp;
                }      
                }
                // newMatrix = mat;
                // System.out.println("New matrix " + Arrays.deepToString(newMatrix));
            }
        }
        return mat;
        
    }
    
}
