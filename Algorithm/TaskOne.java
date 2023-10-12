package Algorithm;

class TaskOne{
    public static void main(String[] args){
        String example = "Hello World!";
        String reserved = reservedWord(example);
        System.out.println(reserved);
    }

    public static String reservedWord(String word){
        String reserved = ""; 

        for(int i = word.length() - 1; i >= 0; i--){
            reserved += word.charAt(i);
        }

        return reserved;
    }
}
