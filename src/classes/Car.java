package classes;

class Car {

    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    // Constructor (Kurucu) Metot
    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    // Davranışlar

    void increaseSpeed(int increment) {
        this.speed += increment;
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0 )
            this.speed -= decrease;
    }

    void printSpeed() {
        System.out.println("Hızınız: " + this.speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model  : " + this.model);
        System.out.println("Color  : " + this.color);
        System.out.println("Type  : " + this.type);
        System.out.println("Speed  : " + this.speed);
    }

}
