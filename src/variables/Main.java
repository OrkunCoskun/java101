package variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Manav Kasa Programı

        double armutKG=2.14, elmaKG =3.67, domatesKG = 1.11, muzKG = 0.95, patlicanKG=5.00, toplam;
        int armut,elma,domates,muz,patlican;

        Scanner sc = new Scanner(System.in);
        System.out.println("Armut Kaç kilo? :");
        armut = sc.nextInt();
        System.out.println("Elma Kaç kilo? :");
        elma = sc.nextInt();
        System.out.println("Domates Kaç kilo? :");
        domates = sc.nextInt();
        System.out.println("Muz Kaç kilo? :");
        muz = sc.nextInt();
        System.out.println("Patlıcan Kaç kilo? :");
        patlican = sc.nextInt();

        toplam = (armut * armutKG) + (elma * elmaKG) + (domates * domatesKG) + (muz * muzKG) + (patlican * patlicanKG);

        System.out.println("Toplam Tutar: " + toplam);



        //Vücut Kitle İndeksi Hesaplayan Program

//        int kilo;
//        double boy;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
//        boy = sc.nextDouble();
//
//        System.out.println("Lütfen kilonuzu giriniz: ");
//        kilo = sc.nextInt();
//
//        double bmi = kilo / (boy * boy);
//        System.out.println("Vücut Kitle İndeksiniz: " + bmi);



        //Dairenin Alanını ve Çevresini Bulan Program

//        int r,a;
//        double pi=3.14;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Yarı çapı giriniz: ");
//        r = sc.nextInt();
//        System.out.println("a değerini giriniz: ");
//        a = sc.nextInt();
//
//        double alan = pi * r * r;
//        double cevre = 2 * pi * r;
//        double aAlan = (pi* (r*r) * a) / 360;
//
//        System.out.println("Alan: " + alan);
//        System.out.println("Çevre: " + cevre);
//        System.out.println("A Alan: " + aAlan);


        //Taksimetre Programı

//        Scanner sc = new Scanner(System.in);
//
//        double perKm=2.20,km,total=10;
//
//        System.out.println("KM giriniz: ");
//        km = sc.nextDouble();
//        total += km*perKm;
//        total = (total < 20) ? 20 : total;
//        System.out.println("Toplam tutar: "+ total);



        //Dik Üçgende Hipotenüs Bulan Program

//        Scanner sc = new Scanner(System.in);
//
//        double a,b,c,u,Alan;
//
//        System.out.println("Enter a: ");
//        a = sc.nextDouble();
//        System.out.println("Enter b: ");
//        b = sc.nextDouble();
//        System.out.println("Enter c: ");
//        c = sc.nextDouble();
//
//        u = (a + b + c) / 2;
//
//        Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
//        System.out.println(Alan);




        //KDV Tutarı Hesaplayan Program

//        Scanner sc = new Scanner(System.in);
//        double para, kdvOran, kdvli;
//        System.out.println("Para giriniz: ");
//        para = sc.nextInt();
//        if(para <= 1000 && para >= 0) {
//            kdvOran = 0.18;
//        }
//        else
//            kdvOran = 0.08;
//
//        kdvli = para + (para * kdvOran);
//        System.out.println("KDV'siz Fiyat= " + para);
//        System.out.println("KDV'li Fiyat = " + kdvli);
//        System.out.println("KDV Oranı = " + kdvOran);



        //NOT Hesaplayan Program

//        System.out.println("Notları giriniz: ");
//        System.out.println("Matematik: ");
//        int mat = sc.nextInt();
//        System.out.println("Fizik: ");
//        int fizik = sc.nextInt();
//        System.out.println("Kimya: ");
//        int kimya = sc.nextInt();
//        System.out.println("Türkçe: ");
//        int türkce = sc.nextInt();
//        System.out.println("Tarih: ");
//        int tarih = sc.nextInt();
//        System.out.println("Müzik: ");
//        int muzik = sc.nextInt();
//
//        System.out.println("Ortalama: ");
//        double ortalama = (mat + fizik + kimya + türkce + tarih + muzik) / 6;
//        System.out.println(ortalama);
//        String sonuc = (ortalama>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
//        System.out.println(sonuc);
    }
}