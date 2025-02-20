package LiskovSubstitutionViolation;

public class LiskovSubstitutionViolationF {
    public static void main(String[] args) {
        Flyable bird = new Sparrow();
        bird.fly();

        Bird ostrich = new Ostrich();
    }
}

abstract class Bird {
    public abstract void sing();
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void sing() {
        System.out.println("Sparrow is singing");
    }
}

class Ostrich extends Bird {
    @Override
    public void sing() {
        System.out.println("Ostrich is singing");
    }
}
