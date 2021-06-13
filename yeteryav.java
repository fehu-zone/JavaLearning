import java.util.Scanner;

public class yeteryav {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        String isim;
        int sesli = 0;

        System.out.println("Lütfen Cümlenizi yazınız: ");
        isim = scan.nextLine();

        for (int i = 0; i < isim.length(); i++) {

            char c = isim.charAt(i);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
                sesli++;

            }
                    

             
                
            

        }

        System.out.println("Cümledeki Sesli Sayı: " + sesli);
        System.out.println("Cümledeki Sessiz Sayı: " + (isim.length()-sesli));






























    }
    
}
