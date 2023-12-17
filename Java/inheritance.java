class Scratch {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Grizzly Gary", "Bear","Grrrr!!!");
        myAnimal.sayHello();
        myAnimal.makeNoise();
        myAnimal.sleep();

        Dog myDog = new Dog("Fido", "Woof woof!", 5);
        myDog.sayHello();
        myDog.makeNoise();
        myDog.sleep();
        myDog.wagTail();

        Cat myCat = new Cat("Max", "Meow!!", false);
        myCat.sayHello();
        myCat.makeNoise();
        myCat.sleep();
        myCat.nagForFood();
    }
}

class Animal {
    String name;
    String type;
    String noise;

    public Animal(String name, String type, String noise) {
        this.name = name;
        this.type = type;
        this.noise = noise;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name + ". I am the animal " + type + "!");
    }

    void makeNoise() {
        System.out.println(noise);
    }

    void sleep() {
        System.out.println("Zzzzz....");
    }
}

class Dog extends Animal {
    int barkVolume;

    public Dog(String name, String noise, int barkVolume) {
        super(name, "Dog", noise);
        this.barkVolume = barkVolume;
    }

    void wagTail() {
        System.out.println(noise + " Look how happy I am. I am wagging my tail :)");
    }
}

class Cat extends Animal {
    boolean likesToScratch = true;

    public Cat(String name, String noise, boolean likesToScratch) {
        super(name, "Cat", noise);
        this.likesToScratch = likesToScratch;
    }

    void nagForFood() {
        if(likesToScratch) {
            System.out.println(noise+" <scratch to the arm> Feed Me!!");
        } else {
            System.out.println(noise + " <paw to face> Feed me!!");
        }
    }
}