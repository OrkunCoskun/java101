package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları:");
        Arrays.sort(list);

        int counter = 1;

        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        counter++;
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            } else if (list[i] != list[i-1]) {
                for (int j = 0; j < list.length; j++) {
                    if ((i != j) && (list[i] == list[j])) {
                        counter++;
                    }
                }
                System.out.println(list[i] + " sayısı " + counter + " kere tekrar edildi.");
            }
            counter = 1;
        }


        //Dizideki Elemanları Küçükten Büyüğe Sıralayan Program

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Dizinin boyutu n:");
//        int size = sc.nextInt();
//
//        System.out.println("Dizinin elemanlarını giriniz: ");
//        int[] list = new int[size];
//
//        for (int i = 0; i < list.length; i++) {
//            System.out.print((i+1) + ". Elemanı: ");
//            list[i] = sc.nextInt();
//        }
//        Arrays.sort(list);
//        System.out.println("Sıralama: " + Arrays.toString(list));


        //Dizideki Tekrar Eden Çift Sayıları Bulan Program

//        int[] list = {2, 2, 4, 4, 5, 6, 7, 7, 8, 2, 3, 4, 9, 3};
//
//        int[] evenDuplicates = new int[list.length];
//
//        int startIndex = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if ((i != j) && ((list[i] % 2 == 0) && (list[i] == list[j]))) {
//                    if (!isFind(evenDuplicates, list[i])) {
//                        evenDuplicates[startIndex++] = list[i];
//                    }
//                    break;
//                }
//            }
//        }
//
//        for (int value : evenDuplicates) {
//            if (value != 0) {
//                System.out.println(value);
//            }
//        }

        //Dizideki Tekrar Eden Sayıları Bulan Program

//        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
//
//        int[] duplicate = new int[list.length];
//
//        int startIndex = 0;
//
//        for (int i = 0; i < list.length; i++) {
//            for (int j = 0; j < list.length; j++) {
//                if ((i != j) && (list[i] == list[j])) {
//                    if (!isFind(duplicate, list[i])) {
//                        duplicate[startIndex++] = list[i];
//                    }
//                    break;
//                }
//            }
//        }
//
//        for (int value : duplicate) {
//            if (value != 0) {
//                System.out.println(value);
//            }
//        }


        //Çok Boyutlu Diziler ile B Harfi Yazdıran Program

//        String[][] letter = new String[6][4];
//
//        for (int i = 0; i < letter.length; i++) {
//            for (int j = 0; j < letter[i].length; j++) {
//                if (i == 0 || i == 2 || i == 5) {
//                    letter[i][j] = " * ";
//                }
//                else if (j == 0 || j == 3) {
//                    letter[i][j] = " * ";
//                }
//                else
//                    letter[i][j] = "   ";
//            }
//        }
//
//        for (String[] row: letter) {
//            for (String col: row) {
//                System.out.print(col);
//            }
//            System.out.println();
//        }


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
