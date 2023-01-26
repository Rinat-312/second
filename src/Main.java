

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        System.out.println(a + 10);
//        System.out.println(b - 10);


        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
