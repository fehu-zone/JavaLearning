public class ozelsayilar {
    public static void main (String[] args) {
        for (int x= 1000; x<=9999; x++) {
            int a = x/100;
            int b = x % 100;
            if (a*b + b*b == x)
            System.out.println(x);
        
        }
    }
    
}
