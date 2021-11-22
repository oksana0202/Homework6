/**
 * JAVA 1 Homework6
 * 
 * @author Oksana Ilyakova
 * @version 22.11.2021
 */

class Homework6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Bars", "200", "false");
        Dog dog = new Dog("Alma", "500", "10");

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
        }
    }
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int runMaxLength;
    protected int swimMaxLength;

    Animal (String name, int runMaxLength, int swimMaxLength) {
        this.name= name;
        this.runMaxLength = runMaxLength;
        this.swimMaxLength = swimMaxLength;
    }

    @Override
    public String toString(){
        return (name + ", " + runMaxLength + ", " + swimMaxLength);
    }
}

class Cat extends Animal {
    private final int runMaxLength = 200;
    Cat(String name, int runMaxLength, int swimMaxLength) {
        super(name, runMaxLength, swimMaxLength);
    }
}


class Dog extends Animal {
    private final int runMaxLength = 500;
    private final int swimMaxLength = 10
    Dog(String name, int runMaxLength, int swimMaxLength) {
        super(name, runMaxLength, swimMaxLength);
    }
}
