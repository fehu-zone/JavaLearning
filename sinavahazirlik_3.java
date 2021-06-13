import java.util.Scanner;
public class sinavahazirlik2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Buyuk = 0;
        int Kucuk = 100;

        Scanner bir = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {

            int sayi1 = bir.nextInt();
            Buyuk = Math.max(sayi1, Buyuk);
            Kucuk = Math.min(sayi1, Kucuk);

        }

        System.out.println("En büyük : " + Buyuk);
        System.out.println("En küçük : " + Kucuk);

        























    }
    
}
