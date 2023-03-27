import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //KDV Tutarı Hesaplayan Program

        Scanner sc = new Scanner(System.in);
        double para, kdvOran, kdvli;
        System.out.println("Para giriniz: ");
        para = sc.nextInt();
        if(para <= 1000 && para >= 0) {
            kdvOran = 0.18;
        }
        else
            kdvOran = 0.08;

        kdvli = para + (para * kdvOran);
        System.out.println("KDV'siz Fiyat= " + para);
        System.out.println("KDV'li Fiyat = " + kdvli);
        System.out.println("KDV Oranı = " + kdvOran);

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