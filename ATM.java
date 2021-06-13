import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        
        int bakiye = 1000;
        
        int islem;




        System.out.println("1: Bakiye Sorgulama ");
        System.out.println("2: Para Yatırma ");
        System.out.println("3: Para Çekme ");
        System.out.println("4: Döviz Çevirici ");
        System.out.println("5: İşlemden Çıkış ");
        System.out.println("Geçersiz İşlem");
        

        islem = scan.nextInt();
        
        switch(islem) {
           
           
            case 1:
                System.out.println("Bakiyeniz " + bakiye + " Türk Lirasıdır");
                break;




            case 2:
                System.out.println("Yatırmak İstediğiniz Miktarı Giriniz");
                int yatirilan_para = scan.nextInt();
                bakiye = bakiye + yatirilan_para;
                System.out.println("Eklenen Tutarla Yeni Bakiyeniz: " + bakiye + " Türk Lirasıdır.");
                System.out.println("İşlemi Onaylıyor Musunuz?");
                int onay2= scan.nextInt();
                switch(onay2){
                case 1:
                 System.out.println("İşlem gerçekleşti. Eklenen Tutarla Yeni Bakiyeniz: " + bakiye + " Türk Lirasıdır. ");
                    break;
                case 2:
                    System.out.println("İşleminiz Reddedildi!");
                    break;
                default:
                    System.out.println("Geçersiz İşlem :(");
                    break;
            }

            case 3:
                System.out.println("Çekmek İstediğiniz Miktarı Giriniz");
                int cekilmek_istenen_para = scan.nextInt();
                bakiye = bakiye - cekilmek_istenen_para;
                if (cekilmek_istenen_para > bakiye){

                    System.out.println("UYARI: Çekilen Miktar Mevcut Bakiyenizden Daha fazla Olamaz.");
                    break;
                }

                
                else {

                    
                    System.out.println(" Çekilen miktarla Beraber Bakiyeniz " + bakiye + "Türk Lirasıdır.");
                    break;
                }


          
        case 4: System.out.println("Dolar Çeviriciye Hoşgeldiniz");
                
                int Döviz = 7;
            
            bakiye = bakiye*Döviz;
            System.out.println(" Paranızın Dolar Cinsinden Değeri " + bakiye + " Türk Lirasıdır. ");
            break;

        case 5: System.out.println(" Bizi Seçtiğiniz İçin Teşekkürler :) Görüşmek Üzere");
        break;

                        

                
                

                    











                    
                        

                    
                }
                





                
                

            
            

    
                

                





                
            


            
                


        




























    }
       
}
