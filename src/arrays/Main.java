package arrays;

public class Main {
    public static void main(String[] args) {

        //Dizideki Sayıların Harmonik Ortalamasını Hesaplayan Program

        int[] numbers = {1, 2, 3, 4, 5, 6};

        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += 1.0 / numbers[i];
        }
        System.out.println(sum);

        double average = numbers.length / sum;

        System.out.println(average);


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
