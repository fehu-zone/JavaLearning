import java.util.Scanner;
public class Sayıtahminoyunu {

	public static void main(String[] args) {
		
		

			
				
				int Maks,Min;
				Maks = 1024;
						Min =1;
						
						int x =(int)(Math.random()*(Maks-Min+1))-Min;
				System.out.println("oyuna başlayalım. Sayı Tahmininizi yapın :)");
				for (int  a=1; a<10; a++){
					Scanner giris = new Scanner (System.in);
					
                    int secim = giris.nextInt();
                    
					
		  if(secim==a){System.out.println("bildiniz");}
		  if(secim>=a){System.out.println("daha küçük sayı seçiniz");}
		  if(secim<a){System.out.println("daha YÜKSEK sayı seçiniz");}
		  
		  
				}
				
				System.out.println("10 deneme hakkını doldurdunuz :(");
		}
		
    }
    