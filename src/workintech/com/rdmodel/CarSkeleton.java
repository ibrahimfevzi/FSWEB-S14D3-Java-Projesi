package workintech.com.rdmodel;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    public String startEngine() {
        System.out.println( "Class Name: " + this.getClass().getSimpleName());
        return getName() + " is starting engine.";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is being driven.";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof GasPoweredCar){
            System.out.println("Gas-powered engine started.");
        }else if (carSkeleton instanceof ElectricCar){
            System.out.println("Electric engine started.");
        }else if (carSkeleton instanceof HybridCar){
            System.out.println("Hybrid engine started.");

        }
    }



}
