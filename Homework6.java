/**
 * JAVA 1 Homework 6
 * 
 * @author Oksana Ilyakova
 * @version 22.11.2021
 */

class Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "200", "false");
        Dog dog = new Dog("Alma", "500", "10");

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
        }
    }
}

abstract class Animal {
    protected String name;
    protected int runLength;
    protected int swimLength;

    Animal (String name, int runLength, int swimLength) {
        this.name= name;
        this.runLength = runLength;
        this.swimLength = swimLength;
    }

    @Override
    public String toString(){
        return (name + ", " + runLength + ", " + swimLength);
    }
}

    class Cat extends Animal {
    Cat(String name, int runLength, int swimMaxLength) {
        super(name, runLength, 0);
    }
}

    class Dog extends Animal {
    Dog(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
    }
}
