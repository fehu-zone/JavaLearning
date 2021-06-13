import java.util.Scanner;
public class sınavahazırlık {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);





         // KULLANICIDAN İSMİNİ ALIP EKRANA TERSTEN YAZAN PROGRAM

         /*
         String isim;
         
         System.out.println("Lütfen İsim Giriniz");

         isim = scan.nextLine();

         int i;

         for(i=isim.length()-1; i>=0; i--) {

             System.out.print(isim.charAt(i));
             
         }

         */






         // KULLANICIDAN ALINAN 3 SAYININ EN BÜYÜĞÜNÜ BULAN PROGRAMI YAZINIZ 


        /*  

         int a, b, c;

         System.out.println("1. Sayıyı Giriniz: ");
         a = scan.nextInt();

         System.out.println("2. Sayıyı Giriniz: ");
         b = scan.nextInt();

         System.out.println("3. Sayıyı Giriniz: ");
         c = scan.nextInt();

         if (a > b && a > cc)
             System.out.println("En Büyük Sayı" + a);
         else if (b > a && b > c)
             System.out.println("En Büyük Sayı" + b);
         else if (c > a && c > b)
             System.out.println("En büyük Sayı" + c);


    */         


    // STRİNG İÇİNDEKİ SESLİ HARFLERİ BULMAK 

    String isim;
    int sesli;

    

    System.out.println("Lütfen Cümlenizi yazınız: ");
    isim = scan.nextLine();

    for(int i=0; i<isim.length(); i++){
        char c = isim.charAt(i);
        if ( c== 'a' || c== 'e' || c== 'ı' || c== 'i' || c== 'o' || c== 'ö' || c== 'u' || c== 'ü' || c== 'o' || c== 'ö' || c== 'u' || c== 'ü')  {
            sesli++;
        }

    }

    System.out.println("Cümledeki Sesli Sayı: " + sesli);
    System.out.println("Cümledeki Sessiz Sayı: " + (isim.length()-sesli));


















































    }

    private static Char extracted(String isim, int i) {
        Char c = isim.charAt(i);
        return c;
    }
    
}
