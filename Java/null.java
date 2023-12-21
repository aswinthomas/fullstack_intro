class Scratch {

    static Dog myDog;

    public static void main(String[] args) {
        //myDog = new Dog("Fido"); --> Commenting this results in java.lang.NullPointerException in next line
        myDog.bark();
    }
}

class Dog {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Woof! woof!");
    }

}