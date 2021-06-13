import java.util.Scanner;
public class soru5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h,k,l,m,n;
        h= (int) (Math.random()*100+1);
        k= (int) (Math.random()*100+1);
        l= (int) (Math.random()*100+1);
        m= (int) (Math.random()*100+1);
        n= (int) (Math.random()*100+1);

        if (h>k)
        {
            System.out.println("En büyük " + h);
        }
        else if (k>l)
        {
            System.out.println("En büyük " + k);
        }
        else if (l>m)
        {
            System.out.println("En büyük " + l);
        }

        else if (m>n){
            System.out.println("En büyük " + m);
        }

        else {
            System.out.println("En büyük " + n);
        }







    }
    
}
