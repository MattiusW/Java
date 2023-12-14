import java.util.Arrays;

public class TheKWeakestRow {
    
    public static void main(String[] args){
        int[][] soldiers = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };

        int[] weakRow = kWeakestRows(soldiers, 0);
        System.out.println(Arrays.toString(weakRow));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[mat.length];
        int[] weak = new int[mat.length];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    result[i] += mat[i][j];
                }
            }
        }
        
        System.out.println(Arrays.toString(result));
        
         for(int i = 0; i < mat.length; i++){
            int index = 0;
            int min = result[0];
            for(int j = 1; j < result.length; j++){
                if(result[j] < min){
                    min = result[j];
                    index = j;
                }
            }
            weak[i] = index;
            result[index] = mat[0].length + 1;
        }

        return weak;
    }

}
