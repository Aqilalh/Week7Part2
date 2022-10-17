package CodeAlongHw3;

public class LiskovSubstitutionPrinciple {
    /*
    This principle states substitutability of a class by its subclass,
    so a class can be replaced by its subclass in all practical usage
    scenarios, meaning that you should use inheritance only for substitutability.
     */

    public static void main(String[] args) {

        // can't fly
        Ostrich ostrich = new Ostrich();
        ostrich.greet();

        // can fly
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
    }
}

class Bird {

    public void greet() {
        System.out.println("greeting...");
    }
}

class FlyingBird {
    public void fly() {
        System.out.println("flying...");
    }
}

class Sparrow extends FlyingBird {
}

class Ostrich extends Bird {

}

