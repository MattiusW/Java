public class Goal {
    public static void main(String[] args){
        String gola = "G()()(al)";
        System.out.println(interpret(gola));
    }

    public static String interpret(String command) {
        String goal = "";

        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                goal += command.charAt(i);
            }

            if(command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    goal += 'o';
                }
                else{
                    goal += "al";
                }
            }
        }

        return goal;
    }
}
