import java.util.Scanner;
public class onsayıpztf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // İKİ SAYI ARASINDAKİ SAYILARI TOPLAYAN UYGULAMA 

        int toplam=0;
        int bsayi;
        int ksayi;

        System.out.println("Büyük Sayıyı Giriniz:");
        bsayi = scan.nextInt();

        System.out.println("Küçük Sayıyı Giriniz");
        ksayi = scan.nextInt();

        for (int i = ksayi; i<= bsayi; i++) {
            toplam +=i;
        }

        System.out.println("Girilen Sayılar Toplamı" + toplam );




        

        































    }
        
    
}
