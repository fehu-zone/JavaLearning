import java.util.Scanner;
public class sayitahminoyunu {

    int sayi = (int)(Math.random()*1025);
		Scanner atama = new Scanner(System.in);
		int hak = 0;
		int tahmin;
        System.out.println("bir Tahminde Bulununuz");
        
		
		for(int x=1; x<=1024; x++); {

			tahmin = atama.nextInt();
			hak = hak + 1;
			if (hak == 10) {
                System.out.println("Hakkınız Bitti Kaybettiniz");
                
				break;
				
			}
			else if (tahmin < sayi) {
				System.out.println("Daha Büyük Bir Sayı Giriniz");
				
			}
			else if (tahmin > sayi) {
				System.out.println("Daha Küçük Bir Sayı Giriniz");
				
			}
			else if (tahmin == sayi) {
				System.out.println("Tebrikler Bildiniz");
				break;
			
			}
		
		}

	}

}

    
}
