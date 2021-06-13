import java.util.Scanner;

public class 19010207012_oyun_odev {

    public static void main(String[] args) {

        int Maks, Min;
        Maks = 1024;
        Min = 1;

        int x = (int) (Math.random() * (Maks - Min + 1)) - Min;
        System.out.println("TAHMİNİNİZİ YAPINIZ");
        for (int a = 1; a < 10; a++) {
            Scanner giriş = new Scanner(System.in);

            int tahmin = giriş.nextInt();

            if (tahmin == a) {
                System.out.println("TEBRİKLER BİLDİNİZ");
            }
            if (tahmin >= a) {
                System.out.println("DAHA KÜÇÜK BİR SAYI GİRİNİZ");
            }
            if (tahmin < a) {
                System.out.println("DAHA YÜKSEK BİR SAYI GİRİNİZ");
            }

        }

        System.out.println("HAKLARINIZI TÜKKETTİNİZ");
    }

}