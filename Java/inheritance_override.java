
class Scratch {
    public static void main(String[] args) {
        Car car = new Car("Ford Mustang");
        car.describeVehicle();
        car.start();
        car.stop();
        car.beepHorn();

        Plane plane = new Plane(true);
        plane.describeVehicle();
        plane.start();
        plane.fly();
        plane.stop();

    }
}

class Vehicle {
    String name;
    int numberOfWheels;
    boolean canFly;

    public Vehicle(String name, int numberOfWheels, boolean canFly) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.canFly = canFly;
    }

    void describeVehicle() {
        System.out.println("VEHICLE DETAILS -- Name: " + name + ", Num wheels: " + numberOfWheels + ", Capable of Flight: " + canFly);
    }

    void start() {
        System.out.println("<Engine Started>");
    }

    void stop() {
        System.out.println("<Engine Stopped>");
    }
}

class Car extends Vehicle {
    String model;

    public Car(String model) {
        super("Car", 4, false);
        this.model = model;
    }

    void beepHorn() {
        System.out.println("Beep!! Beep!!");
    }

    @Override
    void describeVehicle() {
        super.describeVehicle();
        System.out.println("CAR DETAILS -- Model: " + model);
    }
}

class Plane extends Vehicle {
    boolean hasPropellers;

    public Plane(boolean hasPropellers) {
        super("Plane", 3, true);
        this.hasPropellers = hasPropellers;
    }

    @Override
    void describeVehicle() {
        super.describeVehicle();
        System.out.println("PLANE DETAILS -- Has Propellers: " + hasPropellers);
    }

    @Override
    void start() {
        super.start();
        if (hasPropellers) {
            System.out.println("<Propellers started>");
        }
    }

    @Override
    void stop() {
        super.stop();
        if (hasPropellers) {
            System.out.println("<Propellers stopped>");
        }
    }

    void fly() {
        System.out.println("Whoosh!!");
    }
}