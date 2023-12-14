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
        
        Arrays.sort(result);

        for(int w = 1; w < result.length; w++){
           for(int m = 0; m < w; m++){
            System.out.println(m);
           }
        }

        return weak;
    }

}
