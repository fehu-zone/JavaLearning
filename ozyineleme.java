public class ozyineleme {

    static int topla(int x) {
        if (x>0)
            return x + topla (x-1);
        else
            return 0;




    }




    public static void main(String[] args) {


        int sonuc = topla (3);
        System.out.println(sonuc);




        
    }
    
}
