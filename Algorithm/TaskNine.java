package Algorithm;

class TaskNine{
    public static void main(String[] args){
        String example = "Example string to test";
        System.out.println(howManyWords(example));
    }

    public static int howManyWords(String word){
        int howMany = 0;

        for(int i = 0; i <= word.length(); i++){
            howMany = i; 
        }

        return howMany;
    }
}