public class main {

    public static void main (String[] args) {

        telefon tel = new telefon();

        tel.androidmodel = "Poco X3 ";
        System.out.println(tel.androidmodel + tel.androidsurum);
        tel.androidmodel = "Samsung S11";
        System.out.println(tel.androidmodel);
        tel.androidmodel = "S20 Ultra";
        System.out.println(tel.androidmodel);
        tel.androidmodel = "Xiaomi RedMi Note 9 Pro";
        System.out.println(tel.androidmodel);
        tel.androidmodel = "Asus Zenfone 5";
        System.out.println(tel.androidmodel);

       

        telefon tel2;
        tel2= new telefon();
        tel2.ıosmodel = "İphone 11 max pro ";
        System.out.println(tel2.ıosmodel);


        
    }
    
}
