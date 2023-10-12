package Algorithm;

class TaskFour{
    public static void main(String[] argsa){
        int table[] = {6,1,4,7,2,5};
        int max = maxValue(table);
        System.out.println("Max value in table: " + max); 
    }

    public static int maxValue(int[] tab){
        int max = tab[0];
        int i = 1;
        int table = tab.length;
        
        while(i < table){
            if(max < tab[i]){
                max = tab[i];
            }
            i++;
        }

        return max;
    }
}
