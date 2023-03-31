package ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcı Girişi

        String username, password,answer, newPassword;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanıcı adınız: ");
        username = sc.nextLine();

        System.out.println("Şifreniz: ");
        password = sc.nextLine();

        if(username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        }
        else {
            System.out.println("Bilgileriniz Yanlış! Şifrenizi sıfırlamak istiyor musunuz?");
            answer = sc.nextLine();
            if(answer.equals("evet")) {
                System.out.println("Yeni şifreyi giriniz: ");
                newPassword = sc.nextLine();
                if(newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else
                    System.out.println("Şifre oluşturuldu!");
            }
            else
                System.out.println("Sistemden çıkıldı");
        }



        //Basit Hesap Makinesi

//        int n1,n2,select;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Birinci Sayıyı Giriniz: ");
//        n1 = sc.nextInt();
//        System.out.println("İkinci Sayıyı Giriniz: ");
//        n2 = sc.nextInt();
//
//        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
//        System.out.println("Seçiminiz: ");
//        select = sc.nextInt();
//
//        switch (select) {
//            case 1:
//                System.out.println("Toplam: " + (n1 + n2) );
//                break;
//            case 2:
//                System.out.println("Çıkarma: " + (n1 - n2) );
//                break;
//            case 3:
//                System.out.println("Çarpım: " + (n1 * n2) );
//                break;
//            case 4:
//                if (n2 != 0){
//                    System.out.println("Bölüm: " + (n1 / n2));
//                }
//                else {
//                    System.out.println("Bir sayı 0'a bölünemez!");
//                }
//                break;
//            default:
//                System.out.println("Hata");
//
//        }

//        if(select == 1) {
//            System.out.println("Toplam: " + (n1 + n2) );
//        }
//        else if(select == 2) {
//            System.out.println("Çıkarma: " + (n1 - n2) );
//        }
//        else if(select == 3) {
//            System.out.println("Çarpım: " + (n1 * n2));
//        }
//        else if(select == 4) {
//            if (n2 != 0){
//                System.out.println("Bölüm: " + (n1 / n2));
//            }
//            else {
//                System.out.println("Bir sayı 0'a bölünemez!");
//            }
//        }
//        else
//            System.out.println("Hata");


    }
}
