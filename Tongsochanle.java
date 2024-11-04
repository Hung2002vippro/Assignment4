package assignment4;

public class Tongsochanle {

    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                m = m + i;
            } else {
                n = n + i;
            }
        }
        System.out.println("Tong cac so chan tu 1 den 100 = " + m);
        System.out.println("Tong cac so le tu 1 den 100 = " + n);
    }
}
