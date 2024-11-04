package assignment4;

import java.util.Scanner;

public class Tongcacchuso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n = scanner.nextInt();
        int m = 0;
        while (n != 0) {
            m = m + (n % 10);
            n = n / 10;
        }
        System.out.println("Tong cac chu so = " + m);

    }

}
