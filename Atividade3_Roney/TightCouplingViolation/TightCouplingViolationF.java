package TightCouplingViolation;

public class TightCouplingViolationF {
    public static void main(String[] args) {
        Engine engine = new GasolineEngine();
        Car car = new Car(engine);
        car.start();
    }
}

interface Engine {
    void start();
}

class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gasoline engine started");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }
}

class Car {
    private Engine engine;

    // Injeção de dependência via construtor
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car is running");
    }
}
