package workintech.com.pacificmodel;


import java.util.Objects;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;



    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Name: " + name + ", Cylinders: " + cylinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        return "the " + getClass().getSimpleName() + "'s engine is starting.";
    }

    public String accelerate() {
        return "the " + getClass().getSimpleName() + " is accelerating.";
    }

    public String brake() {
        return "the " + getClass().getSimpleName() + " is braking.";
    }



}
