package assignment4;

public class Songuyento {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i != 1) {
                int dem = 0;
                for (int k = 2; k < i; k++) {

                    if (i % k == 0) {
                        dem++;
                    }

                }
                if (dem == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
