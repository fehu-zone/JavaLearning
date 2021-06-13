import java.util.Scanner;
public class soru3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sayi, bolunen = 0;
        System.out.println("Lütfen bir sayı giriniz:");
        sayi = sayi_girisi.nextInt();
        for(sayi<=2) {
            System.out.println("Lütfen 2 den büyük bir sayı giriniz:");
            sayi=sayi_girisi.nextInt();
        }
        for(int i=2;i<sayi;i++){
            if(sayi%i==0;){ bolunen++;}
        }
        if(bolunen==0){
            System.out.println(sayi+" asal sayıdır.");
        }
        else {
           System.out.println(sayi+" asal değildir.");
        }
        








    }
    
}
