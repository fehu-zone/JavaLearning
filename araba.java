public class araba {
    
    public void hiz(int surat) {

        System.out.println("Arabanın Hızı = " + surat);

    }
        
    
    public void renk(String color ) {

        System.out.println("Arabanın rengi = " + color );
   
    }

    public void hp(int horsepower) {
        System.out.println("Arabanın Beygir Gücü = " + horsepower );
    }

    





    public static void main(String[] args) {

        araba volvo = new araba();
        volvo.hiz(90);
        volvo.renk("Turkuaz");
        volvo.hp(250);



        
        araba bmw = new araba ();
        bmw.hiz(120);
        bmw.renk("Siyah");
        bmw.hp(420);

        





        
    }
    
}
