import java.util.Scanner;
public class sayi_tahmin_oyunu_19010207012 {



    int mak,min;
				mak = 1024;
						min =1;
						
						int x =(int)(Math.random()*(mak-min+1))-min;
				System.out.println("TAHMİNİNİZİ YAPINIZ");
				for (int  a=1; a<10; a++){
					Scanner giriş = new Scanner (System.in);
					
					int tahmin = giriş.nextInt();
					
		  if(tahmin==a){System.out.println("TEBRİKLER BİLDİNİZ");}
		  if(tahmin>=a){System.out.println("DAHA KÜÇÜK BİR SAYI GİRİNİZ");}
		  if(tahmin<a){System.out.println("DAHA YÜKSEK BİR SAYI GİRİNİZ");}
		  
		  
				}
				
				System.out.println("HAKLARINIZI TÜKKETTİNİZ");
		}
		
}
    

