package classes;

public class Main {
    public static void main(String[] args) {

        //Boks Oyunu

        Fighter f1 = new Fighter("A", 10, 120, 100, 40);
        Fighter f2 = new Fighter("B", 20, 85, 85, 40);

        Match match = new Match(f1,f2,85,100);

        match.run();





        //Öğrenci Bilgi Sistemi

//        Teacher t1 = new Teacher("Mahmut Hoca","555","TRH");
//        Teacher t2 = new Teacher("Graham Bell","0000","FZK");
//        Teacher t3 = new Teacher("Külyutmaz", "111", "BIO");
//
//        Course tarih = new Course("Tarih","101","TRH");
//        tarih.addTeacher(t1);
//
//        Course fizik = new Course("Fizik","102","FZK");
//        fizik.addTeacher(t2);
//
//        Course biyo = new Course("Biyoloji","101","BIO");
//        biyo.addTeacher(t3);
//
//
//        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
//        s1.addBulkExamNote(100,78,50);
//        s1.isPass();
//
//        Student s2 = new Student("Güdük Necmi", "444", "4", tarih, fizik, biyo);
//        s2.addBulkExamNote(50,30,70);
//        s2.isPass();









//        Car audi = new Car("Sports", "Audi", "red");
//        audi.increaseSpeed(20);
//        audi.printInfo();
//
//        Car bmw = new Car("Sports" , "BMW" , "blue");
//        bmw.increaseSpeed(10);
//        bmw.increaseSpeed(25);
//        bmw.increaseSpeed(5);
//        bmw.decreaseSpeed(25);
//        bmw.printInfo();
//
//        Car mercedes = new Car("Corporate" , "Mercedes" , "black");
//        mercedes.speed = 20;
//        mercedes.printInfo();
    }
}
