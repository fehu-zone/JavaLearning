public class main_matematik_islemler {
    public static void main(String[] args){
        float[] solDegerler = {10, 20, 30, 40};
        float[] sagDegerler = {2, 4, 6, 8};

        char[] İslemler = {'t', 'f', 'c', 'b'};

        float[] sonuclar = new float[İslemler.length];

        for (int i=0; i<sonuclar.length; i++)
        {
            switch(İslemler[i]) {
                case 't':
                    sonuclar[i] = solDegerler[i] + sagDegerler[i];
                    break;


                case 'f':
                    sonuclar[i] = solDegerler[i] - sagDegerler[i];
                    break;

                case 'c':
                    sonuclar[i] = solDegerler[i] * sagDegerler[i];
                    break;

                case 'b':
                    sonuclar[i] = solDegerler[i] / sagDegerler[i];
                    break;

                default:
                    System.out.println("Geçersiz İşlemler");
                    break;
            }
        }

        for (float gecici: sonuclar) {
            System.out.println(gecici);
        }
        
       
               
    }

        
}