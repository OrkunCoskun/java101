package ifelse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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



        //Artık YIl Hesaplama

//        int year;
//        boolean artik = false;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Yıl Giriniz: ");
//        year = sc.nextInt();
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    artik = true;
//                }
//                else
//                    artik = false;
//            }
//            else
//                artik = true;
//        }
//        else
//            artik = true;
//
//        if (artik) {
//            System.out.println(year + " bir artık yıldır!");
//        }
//        else
//            System.out.println(year + " bir artık yıl değildir!");


        //Çin Zodyağı Hesaplama

//        int birthday;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Doğum Yılınızı Giriniz: ");
//        birthday = sc.nextInt();
//
//        if (birthday % 12 == 0){
//            System.out.println("Çin Zodyağı Burcunuz: Maymun");
//        }
//        else if (birthday % 12 == 1) {
//            System.out.println("Çin Zodyağı Burcunuz: Horoz");
//        }
//        else if (birthday % 12 == 2) {
//            System.out.println("Çin Zodyağı Burcunuz: Köpek");
//        }
//        else if (birthday % 12 == 3) {
//            System.out.println("Çin Zodyağı Burcunuz: Domuz");
//        }
//        else if (birthday % 12 == 4) {
//            System.out.println("Çin Zodyağı Burcunuz: Fare");
//        }
//        else if (birthday % 12 == 5) {
//            System.out.println("Çin Zodyağı Burcunuz: Öküz");
//        }
//        else if (birthday % 12 == 6) {
//            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
//        }
//        else if (birthday % 12 == 7) {
//            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
//        }
//        else if (birthday % 12 == 8) {
//            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
//        }
//        else if (birthday % 12 == 9) {
//            System.out.println("Çin Zodyağı Burcunuz: Yılan");
//        }
//        else if (birthday % 12 == 10) {
//            System.out.println("Çin Zodyağı Burcunuz: At");
//        }
//        else if (birthday % 12 == 11) {
//            System.out.println("Çin Zodyağı Burcunuz: Koyun");
//        }
//        else
//            System.out.println("Hata");




        //Uçak Bileti Fiyatı Hesaplama

//        int type,age,km;
//        double normalPrice,discountPrice,turnReturnPrice,perKm=0.10,totalPrice;
//        double percent50 = 0.50, percent10 = 0.10, percent30 = 0.30, percent20 = 0.20;
//        double ageDiscount50, ageDiscount10, ageDiscount30;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Mesafeyi km türünden giriniz: ");
//        km = sc.nextInt();
//        System.out.println("Yaşınızı giriniz: ");
//        age = sc.nextInt();
//        System.out.println("Yolculuk tipinizi giriniz(1=> Tek Yön, 2=> Gidiş Dönüş): ");
//        type = sc.nextInt();
//
//        if (km <= 0 || age < 0 || (!(type <=2 && type >=1))) {
//            System.out.println("Hatalı veri girdiniz!");
//            return;
//        }
//
//        normalPrice = km * perKm;
//        ageDiscount50 = normalPrice * percent50;
//        ageDiscount30 = normalPrice * percent30;
//        ageDiscount10 = normalPrice * percent10;
//        if(age < 12 && type == 2) {
//            discountPrice = normalPrice - ageDiscount50;
//            turnReturnPrice = discountPrice * percent20;
//            totalPrice = (discountPrice - turnReturnPrice) * 2;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }
//        else if(age < 12) {
//            discountPrice = normalPrice - ageDiscount50;
//            totalPrice = discountPrice;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }
//        if(age > 12 && age < 24 && type == 2) {
//            discountPrice = normalPrice - ageDiscount10;
//            turnReturnPrice = discountPrice * percent20;
//            totalPrice = (discountPrice - turnReturnPrice) * 2;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }
//        else if(age > 12 && age < 24) {
//            discountPrice = normalPrice - ageDiscount10;
//            totalPrice = discountPrice;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }
//        if(age > 65 && type == 2) {
//            discountPrice = normalPrice - ageDiscount30;
//            turnReturnPrice = discountPrice * percent20;
//            totalPrice = (discountPrice - turnReturnPrice) * 2;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }
//        else if (age > 65) {
//            discountPrice = normalPrice - ageDiscount30;
//            totalPrice = discountPrice;
//            System.out.println("Toplam Tutar: " + totalPrice);
//        }




        //Burç Bulan Program


//        int month,day;
//        String burc = "";
//        boolean isError = false;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Doğduğunuz ay: ");
//        month = sc.nextInt();
//
//        System.out.println("Doğduğunuz gün: ");
//        day = sc.nextInt();
//
//        switch (month) {
//            case 1:
//                if (day >= 1 && day <= 31) {
//                    if (day < 22) {
//                        burc = "Oğlak";
//                    }
//                    else
//                        burc = "Kova";
//                }
//                else
//                    isError = true;
//                break;
//            case 2:
//                if (day >= 1 && day <= 28) {
//                    if (day < 20) {
//                        burc = "Kova";
//                    }
//                    else
//                        burc = "Balık";
//                }
//                else
//                    isError = true;
//                break;
//            case 3:
//                if (day >= 1 && day <= 31) {
//                    if (day < 21) {
//                        burc = "Balık";
//                    }
//                    else
//                        burc = "Koç";
//                }
//                else
//                    isError = true;
//                break;
//            default:
//                isError = true;
//        }
//
//        if (isError) {
//            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
//        }
//        else
//            System.out.println("Merhaba, burcunuz : " + burc);

//        int a,b,c;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("1. sayı: ");
//        a = sc.nextInt();
//        System.out.println("2. sayı: ");
//        b = sc.nextInt();
//        System.out.println("3. sayı: ");
//        c = sc.nextInt();
//
//        //Sayıları Küçükten Büyüğe Sıralama
//
//        if (a < b && a < c) {
//            if (b < c) {
//                System.out.println("a < b < c");
//            }
//            else
//                System.out.println("a < c < b");
//        }
//        else if (b < a && b < c) {
//            if (a < c) {
//                System.out.println("b < a < c");
//            }
//            else
//                System.out.println("b < c < a");
//        }
//        else if (c < b && c < a) {
//            if (a < b) {
//                System.out.println("c < a < b");
//            }
//            else
//                System.out.println("c < b < a");
//        }

        //Sayıları Büyükten Küçüğe Sıralama

//        if (a > b && a > c) {
//            if (b > c) {
//                System.out.println("a > b > c");
//            }
//            else
//                System.out.println("a > c > b");
//        }
//        else if (b > a && b > c) {
//            if (a > c) {
//                System.out.println("b > a > c");
//            }
//            else
//                System.out.println("b > c > a");
//        }
//        else if (c > b && c > a) {
//            if (a > b) {
//                System.out.println("c > a > b");
//            }
//            else
//                System.out.println("c > b > a");
//        }


        //Hava Sıcaklığına Göre Etkinlik Önerme

//        int heat;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Sıcaklık Giriniz: ");
//        heat= sc.nextInt();
//
//        if (heat < 5) {
//            System.out.println("Kayak yapabilirsiniz.");
//        }
//        else if (heat <= 25) {
//            if (heat <= 15) {
//                System.out.println("Sinemaya gidebilirsiniz.");
//            }
//            if (heat >= 10) {
//                System.out.println("Pikniğe gidebilirsiniz.");
//            }
//        }
//        else
//            System.out.println("Yüzmeye gidebilirsiniz.");



        //Sınıfı Geçme Durumu

//        int mat,fizik,turkce,kimya,muzik;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Notları giriniz: ");
//        System.out.println("Matematik: ");
//        mat = sc.nextInt();
//        System.out.println("Fizik: ");
//        fizik = sc.nextInt();
//        System.out.println("Türkçe: ");
//        turkce = sc.nextInt();
//        System.out.println("Kimya: ");
//        kimya = sc.nextInt();
//        System.out.println("Müzik: ");
//        muzik = sc.nextInt();
//
//
//        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
//
//        if(!(mat >= 0 && mat <= 100)) {
//            ortalama = (fizik + turkce + kimya + muzik) / 4;
//        }
//        if(!(fizik >= 0 && fizik <= 100)) {
//            ortalama = (mat + turkce + kimya + muzik) / 4;
//        }
//        if(!(turkce >= 0 && turkce <= 100)) {
//            ortalama = (fizik + mat + kimya + muzik) / 4;
//        }
//        if(!(kimya >= 0 && kimya <= 100)) {
//            ortalama = (fizik + turkce + mat + muzik) / 4;
//        }
//        if(!(muzik >= 0 && muzik <= 100)) {
//            ortalama = (fizik + turkce + kimya + mat) / 4;
//        }
//
//
//        if(ortalama >= 55) {
//            System.out.println("Ortalama: " + ortalama);
//            System.out.println("Geçti!");
//        }
//        else {
//            System.out.println("Ortalama: " + ortalama);
//            System.out.println("Kaldı!");
//        }





        //Kullanıcı Girişi

//        String username, password,answer, newPassword;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Kullanıcı adınız: ");
//        username = sc.nextLine();
//
//        System.out.println("Şifreniz: ");
//        password = sc.nextLine();
//
//        if(username.equals("patika") && password.equals("java123")) {
//            System.out.println("Giriş Yaptınız!");
//        }
//        else {
//            System.out.println("Bilgileriniz Yanlış! Şifrenizi sıfırlamak istiyor musunuz?");
//            answer = sc.nextLine();
//            if(answer.equals("evet")) {
//                System.out.println("Yeni şifreyi giriniz: ");
//                newPassword = sc.nextLine();
//                if(newPassword.equals(password) || newPassword.equals("java123")) {
//                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
//                }
//                else
//                    System.out.println("Şifre oluşturuldu!");
//            }
//            else
//                System.out.println("Sistemden çıkıldı");
//        }





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
