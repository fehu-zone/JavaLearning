import java.util.Scanner;
public class sınavahazirlik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int islem;

        

        System.out.println("Sayısal Olarak Alınan Ay Bilgisini Giriniz: " );

        islem = scan.nextInt();

        switch(islem) {

            case 1:
                System.out.println("Seçtiğiniz sayıya göre ay Ocak"  );
                break;


            case 2:
                System.out.println("Seçtiğiniz sayıya göre ay Şubat");
                break;
            

            case 3:
                System.out.println("Seçtiğiniz sayıya göre ay Mart");
                break;

            case 4:
                System.out.println("Seçtiğiniz sayıya göre ay Nisan");
                break;
            

            case 5:
                System.out.println("Seçtiğiniz sayıya göre ay Mayıs");
                break;
            
            

            case 6:
                System.out.println("Seçtiğiniz sayıya göre ay Haziran");
                break;
            

            case 7:
                System.out.println("Seçtiğiniz sayıya göre ay Temmuz");
                break;
            
            
            case 8:
                System.out.println("Seçtiğiniz sayıya göre ay Ağustos");
                break;
            

            case 9:
                System.out.println("Seçtiğiniz sayıya göre ay Eylül");
                break;

            case 10:
                System.out.println("Seçtiğiniz sayıya göre ay Ekim");
                break;

            case 11:
                System.out.println("Seçtiğiniz sayıya göre ay Kasım");
                break;
            
            case 12:
                System.out.println("Seçtiğiniz sayıya göre ay Aralık");
                break;

        }

    }

    
}
