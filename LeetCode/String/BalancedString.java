public class BalancedString {
    
    public static void main(String[] args){
        String s = "LRLRRLLR";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int total = 0;
        int l = 0;
        int r = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'R'){
                r += 1;
                System.out.println("r: " + r);
            }
            
            if(s.charAt(i) == 'L'){
                l += 1;
                System.out.println("l: " + l);
            }

            if(r == l){
                total += 1;
            }
        }
      

        return total;
    }
}
