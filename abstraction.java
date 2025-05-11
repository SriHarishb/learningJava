public class abstraction {
    public static void main(String[] args) {
        car car1 = new car();
        car1.sound();
        car1.color();
        car1.complyRegulations();
    }
}

abstract class Vehicle {
    int vehid;
    String name;

    public void complyRegulations() {
        System.out.println("complyyy");
    }

    public abstract void sound();
    public abstract void color();
}

class car extends Vehicle {
    public void sound() {
        System.out.println("vroom vroom .. crash");
    }

    public void color() {
        System.out.println("black as the night sky");
    }
}
