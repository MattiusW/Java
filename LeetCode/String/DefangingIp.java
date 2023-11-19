package LeetCode.String;

public class DefangingIp {

    public static void main(String[] args){
        String ip = "255.100.50.0";
        System.out.println(defangIPaddr(ip));
    }
    
    public static String defangIPaddr(String address){
        return address.replace(".", "[.]");
    }
}
