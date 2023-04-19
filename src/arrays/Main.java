package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Çok Boyutlu Diziler ile B Harfi Yazdıran Program

        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    letter[i][j] = " * ";
                }
                else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                }
                else
                    letter[i][j] = "   ";
            }
        }

        for (String[] row: letter) {
            for (String col: row) {
                System.out.print(col);
            }
            System.out.println();
        }


        //Dizideki Elemanların Girilen Sayıdan Küçük En Yakın Sayıyı ve En Büyük En Yakın Sayıyı Bulan Program

//        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
//
//        Arrays.sort(list);
//        int minClosed = 0;
//        int maxClosed = 0;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Değer giriniz: ");
//        int value = sc.nextInt();
//
//        for (int i : list) {
//            if (i < value && i > minClosed) {
//                minClosed = i;
//            }
//        }
//
//        for (int i : list) {
//            if (i > value) {
//                maxClosed = i;
//                break;
//            }
//        }
//
//        System.out.println("En yakın minimum değer: " + minClosed);
//        System.out.println("En yakın maksimum değer: " + maxClosed);


        //Dizideki Maksimum ve Minimum Değerleri Bulan Program

//        int[] list = {56, 34, 1, 8, 101, -2, -33};
//
//        int min = list[0];
//        int max = list[0];
//
//        for (int i : list) {
//            if (i < min) {
//                min = i;
//            }
//
//            if (i > max) {
//                max = i;
//            }
//        }
//
//        System.out.println("Minimum Değer: " + min);
//        System.out.println("Maximum Değer: " + max);


        //Dizideki Sayıların Harmonik Ortalamasını Hesaplayan Program

//        int[] numbers = {1, 2, 3, 4, 5, 6};
//
//        double sum = 0.0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += 1.0 / numbers[i];
//        }
//        System.out.println(sum);
//
//        double average = numbers.length / sum;
//
//        System.out.println(average);


        //Dizideki Elemanların Ortalamasını Bulan Program

//        int[] numbers = {1, 2, 3, 4, 5, 6};
//
//        double sum = 0.0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//
//        double average = sum / numbers.length;
//        System.out.println("Ortalama: " + average);
    }
}
