package ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Basit Hesap Makinesi

        int n1,n2,select;
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Giriniz: ");
        n1 = sc.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = sc.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2) );
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2) );
                break;
            case 3:
                System.out.println("Çarpım: " + (n1 * n2) );
                break;
            case 4:
                if (n2 != 0){
                    System.out.println("Bölüm: " + (n1 / n2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Hata");

        }

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
