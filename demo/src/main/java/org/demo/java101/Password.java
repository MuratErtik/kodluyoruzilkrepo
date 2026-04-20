package org.demo.java101;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String currentPassword = "java123";

        System.out.print("Sifrenizi giriniz: ");
        String password = scanner.nextLine();

        if (password.equals(currentPassword)) {
            System.out.println("Giris basarili.");
        } else {
            System.out.println("Sifre yanlis. Sifrenizi sifirlamak ister misiniz? (evet/hayir)");
            String response = scanner.nextLine();

            if (response.equals("evet")) {
                System.out.print("Yeni sifre giriniz: ");
                String newPassword = scanner.nextLine();

                if (newPassword.equals(currentPassword)) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else {
                System.out.println("Sifre sifirlama islemi iptal edildi.");
            }
        }
        scanner.close();
    }
}
