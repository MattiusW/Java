package Spoj;

class SumaLiczbaMniejszychOdSto{

    public static void main(String[] args){
        int wynik = sumaLiczb(100, -68, 12);
        System.out.println(wynik);
    }

    public static int sumaLiczb(int x, int y, int z){
        int ile = 0;

        if (x <= 100 && y <= 100 && z <= 100){
            ile = x + y + z;
        }

        return ile;
    }
}