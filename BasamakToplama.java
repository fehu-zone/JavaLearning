import java.util.Scanner;
public class BasamakToplama {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        
        
        System.out.println("Bir Sayı Giriniz: " );
        int sayi = scan.nextInt();
        int top = 0;

        while (sayi !=0) {
            top += sayi % 10;
            sayi /= 10; 

        }

            
        

        System.out.println("Girilen Sayıların Toplamı " + top);


    }
    
}
