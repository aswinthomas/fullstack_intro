class Scratch {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.name = "Fido";
        dog1.greeting = "Woof woof";
        dog1.breed = "Great Dane";
        dog1.size = 8;

        Dog dog2 = new Dog("Fluffy", "Yip yip", "Yorkshire Terrier", 3);

        dog1.sayHello();
        dog2.sayHello();
        dog1.challenge(dog2);
        dog2.challenge(dog1);
    }
}

class Dog {
    // CLasses have states
    String name;
    String greeting;
    String breed;
    int size;

    // How the class should be built. The constructor
    Dog() {

    }

    Dog(String name, String greeting, String breed, int size) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.greeting = greeting;
    }

    // Classes have behaviors
    void sayHello() {
        System.out.println(greeting + "!" + " My name is " + name + ". My breed is " + breed + ". My size rating is " + size + " out of 10.");
    }

    void challenge(Dog dog) {
        if (dog.size > this.size) {
            System.out.println("I'm " + this.name + ". Oh no! " + dog.name + " was too scary! Run away!");
        } else {
            System.out.println("Haha, nobody messes with " + this.name);
        }
    }
}