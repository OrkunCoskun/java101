package loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Harmonik Sayıları Bulan Program

        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = sc.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);





        //Bir Sayının Basamak Sayılarının Toplamını Hesaplayan Program

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Sayı Giriniz: ");
//        int number = sc.nextInt();
//        int value;
//        int result = 0;
//
//        while (number != 0) {
//            //2451
//            //1
//            value = number % 10;
//            //result = 0 + 1 = 1;
//            result += value;
//            //245
//            number /= 10;
//        }
//        System.out.println(result);


        //Armstrong Sayıları Bulan Program

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Sayı Giriniz: ");
//        int number = sc.nextInt();
//        int basNumber = 0;
//        int tempNumber = number;
//        int basValue;
//        int result = 0;
//        int basPow;
//
//        while (tempNumber != 0) {
//            tempNumber /= 10;
//            basNumber++;
//        }
//        tempNumber = number;
//
//        while (tempNumber != 0) {
//            basValue = tempNumber % 10;
//            basPow = 1;
//            for (int i = 1; i <= basNumber; i++) {
//                basPow *= basValue;
//            }
//
//            result += basPow;
//
//            tempNumber /= 10;
//        }
//        if (result == number) {
//            System.out.println(number + " sayısı bir Armstrong sayısıdır.");
//        }
//        else {
//            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
//        }


//        int a = 2451, basamakSayisi = 0, numberCounter = 0;
//
//        //Basamak Sayısı Bulma İşlemi
//        // 2451 / 10 = 245
//        // 245 / 10 = 24
//        // 24 / 10 = 2
//        // 2 / 10 = 0
//        // 0 / 10 = 0
//
//        while (a != 0) {
//            a /= 10;
//            numberCounter++;
//        }
//        //System.out.println(numberCounter);
//
//
//        // Bir Sayının Son Basamağını Bulma
//        //2451 % 10 = 1
//        int b = 2451;
//        int c = b % 10;
//        //System.out.println(c);
//
//
//        //Üslü Sayı Hesaplayan Program
//        int sub = 2, sup = 3;
//        int result = 1;
//        for (int i = 1; i <= sup; i++) {
//            result *= sub;
//        }
//        System.out.println(result);



        //Üslü Sayı Hesaplayan Program

        //with for loop
//        int n,k, total=1;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Üssü alınacak sayı: ");
//        n = sc.nextInt();
//        System.out.print("Üs olacak sayı: ");
//        k = sc.nextInt();
//        for (int i = 1; i <= k; i++) {
//            total *= n;
//        }
//        System.out.println("Cevap: " + total);

        //with while loop
//        int n,k, total=1, i=1;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Üssü alınacak sayı: ");
//        n = sc.nextInt();
//        System.out.print("Üs olacak sayı: ");
//        k = sc.nextInt();
//        while (i <= k) {
//            total *= n;
//            i++;
//        }
//        System.out.println("Cevap: " + total);

        //Kombinasyon Hesaplayan Program

//        int count = 0, n, r;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("n Giriniz:");
//        n = sc.nextInt();
//        System.out.println("r Giriniz:");
//        r = sc.nextInt();
//
//
//        for (int number1 = 1; number1 < n; number1++) {
//            for (int number2 = number1 + 1; number2 <= r; number2++) {
//                System.out.println(number1 + " " + number2);
//                count++; // Increment count
//            }
//        }
//        System.out.println("Toplam kombinasyon: " + count);

        //Faktöriyel Hesaplayan Program

//        int n;
//        int total = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Sayı Giriniz:");
//        n = sc.nextInt();
//
//        for (int i = 1; i<= n; i++) {
//            total *= i;
//        }
//        System.out.println(n + ". Faktöriyel: " + total);



        //Girilen Sayıdan Küçük 4 ve 5'in Kuvvetlerini Bulan Program

//        int n;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Sayı Giriniz:");
//        n = sc.nextInt();
//
//        System.out.println("4'ün Kuvvetleri");
//        for (int i = 1; i<=n; i*=4) {
//            System.out.println(i);
//        }
//        System.out.println("5'in Kuvvetleri");
//        for (int i = 1; i<=n; i*=5) {
//            System.out.println(i);
//        }

        //Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program

//        int n;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Sayı Giriniz:");
//        n = sc.nextInt();
//
//        for (int i = 1; i<=n; i*=2) {
//            System.out.println(i);
//        }

        //Çift ve 4'ün Katları Olan Sayıların Toplamını Bulan Program

//        int n,sum=0;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.print("Sayı Giriniz: ");
//            n = sc.nextInt();
//            if(n % 2 == 0 && n % 4 == 0) {
//                sum += n;
//            }
//        }while (!(n % 2 == 1));
//        System.out.println("Toplam: " + sum);

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
