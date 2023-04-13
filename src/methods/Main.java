package methods;

import java.util.Scanner;

public class Main {

    //Recursive ile Fibonacci Serisi Bulan Program

    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    //Palindrom Sayılar

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastDigit;
        while (temp != 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }

    static int sum (int a, int b) {
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus (int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times (int a, int b) {
        int result = a * b;
        System.out.println("Çarpım: " + result);
        return result;
    }

    static int divided (int a, int b) {
        if (b == 0) {
            System.out.println("İkinci sayı 0'dan farklı olmalıdır!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm : " + result);
        return  result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("Çevresi: " + (2 * (a + b)));
        System.out.println("Alanı: " + (a * b));
    }

    static int powerRecursive(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * powerRecursive(base, exponent-1);
    }

    static boolean isPrime(int sayi, int bolen) {
        if (sayi < 2)
            return  false;
        if (sayi == 2)
            return true;
        if (sayi % bolen == 0)
            return false;
        if (bolen * bolen > sayi)
            return true;
        return isPrime(sayi, bolen + 1);
    }

    //Desene Göre Metot Oluşturma
    static int dgmo(int x, int tempX, boolean stop) {
        System.out.print(x + " ");
        if (x < 0 || x == 0 || !stop) {
            stop = false;
            if (x != tempX) {
                return dgmo(x + 5, tempX, stop);
            } else
                return 0;
        } else {
            return dgmo(x - 5, tempX, stop);
        }
    }

    public static void main(String[] args) {

        //Desene Göre Metot Oluşturma
        Scanner sc = new Scanner(System.in);
        int x, tempX;
        System.out.print("Bir Sayı Giriniz: ");
        x = sc.nextInt();
        dgmo(x, tempX = x, true);


        //Recursive Asal Sayı Bulan Program

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Bir sayı giriniz :");
//        int sayi = sc.nextInt();
//
//        if (isPrime(sayi,2)){
//            System.out.println(sayi + " asal bir sayıdır.");
//        } else {
//            System.out.println(sayi + " asal bir sayı değildir.");
//        }


        //Recursive Üs Hesabı Yapan Program

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("İlk Sayı: ");
//        int a = sc.nextInt();
//
//        System.out.print("İkinci Sayı: ");
//        int b = sc.nextInt();
//
//        System.out.println(powerRecursive(a,b));



//        System.out.println(isPalindrome(101));
//        System.out.println(fib(9));

        //Gelişmiş Hesap Makinesi

//        Scanner sc = new Scanner(System.in);
//        int select;
//
//        String menu = "1- Toplama İşlemi\n"
//                + "2- Çıkarma İşlemi\n"
//                + "3- Çarpma İşlemi\n"
//                + "4- Bölme İşlemi\n"
//                + "5- Üslü Sayı Hesaplama\n"
//                + "6- Mod Alma\n"
//                + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
//                + "0- Çıkış Yap\n";
//
//        System.out.println(menu);
//        while (true) {
//            System.out.print("Bir İşlem Seçiniz: ");
//            select = sc.nextInt();
//
//            if (select == 0)
//                break;
//
//            System.out.print("İlk Sayı: ");
//            int a = sc.nextInt();
//            System.out.print("İkinci Sayı: ");
//            int b = sc.nextInt();
//
//            switch (select) {
//                case 1:
//                    sum(a, b);
//                    break;
//                case 2:
//                    minus(a, b);
//                    break;
//                case 3:
//                    times(a, b);
//                    break;
//                case 4:
//                    divided(a, b);
//                    break;
//                case 5:
//                    System.out.println("Üs Hesabı: " + power(a, b));
//                    break;
//                case 6:
//                    System.out.println("Mod İşlemi: " + mod(a, b));
//                    break;
//                case 7:
//                    calc(a, b);
//                    break;
//                default:
//                    System.out.println("Geçersiz bir işlem girdiniz!");
//            }
//        }
//        System.out.println("Güle Güle");

    }
}
