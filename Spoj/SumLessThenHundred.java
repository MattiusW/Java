package Spoj;

class SumLessThenHundred{

    public static void main(String[] args){
        int count = amount(100, -68, 12);
        System.out.println(count);
    }

    public static int amount(int x, int y, int z){
        int total = 0;

        if (x <= 100 && y <= 100 && z <= 100){
            total = x + y + z;
        }

        return total;
    }
}