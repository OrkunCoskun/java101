package loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Çift ve 4'ün Katları Olan Sayıların Toplamını Bulan Program

        int n,sum=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz: ");
            n = sc.nextInt();
            if(n % 2 == 0 && n % 4 == 0) {
                sum += n;
            }
        }while (!(n % 2 == 1));
        System.out.println("Toplam: " + sum);

        //Tek Sayıların Toplamını Bulan Program

//        int n,sum=0;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Sayı Giriniz: ");
//            n = sc.nextInt();
//            if(n % 2 == 1) {
//                sum += n;
//            }
//        }while (n > 0);
//        System.out.println("Toplam: " + sum);



        //Girilen Sayıya Kadar Olan 3 ve 4'e Tam Bölünen Sayıların Ortalamasını Hesaplayan Program

//        int k,sum=0,count=0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Sayı Giriniz: ");
//        k = sc.nextInt();
//
//        for (int i = 0; i <= k; i++) {
//            if ((i % 3 == 0) && (i % 4 ==0)) {
//                sum += i;
//                count++;
//            }
//        }
//        double average = (double) sum / count;
//        System.out.println("Ortalama: " + average);




        //Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program

//        int k;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Sayı Giriniz: ");
//        k = sc.nextInt();

        //with while loop
//        int j=1;
//        while(j <=k) {
//            j++;
//            if (j % 2 == 0) {
//                System.out.println(j + " çift sayıdır");
//            }
//        }

        //with for loop
//        for (int i = 1; i <= k; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " çift sayıdır");
//            }
//        }
    }
}
