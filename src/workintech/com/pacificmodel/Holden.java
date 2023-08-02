package workintech.com.pacificmodel;

public class Holden extends Car{

    public Holden(int cylinders, String name){
        super(cylinders, name);
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
