import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Notları giriniz: ");
        System.out.println("Matematik: ");
        int mat = sc.nextInt();
        System.out.println("Fizik: ");
        int fizik = sc.nextInt();
        System.out.println("Kimya: ");
        int kimya = sc.nextInt();
        System.out.println("Türkçe: ");
        int türkce = sc.nextInt();
        System.out.println("Tarih: ");
        int tarih = sc.nextInt();
        System.out.println("Müzik: ");
        int muzik = sc.nextInt();

        System.out.println("Ortalama: ");
        double ortalama = (mat + fizik + kimya + türkce + tarih + muzik) / 6;
        System.out.println(ortalama);
        String sonuc = (ortalama>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}