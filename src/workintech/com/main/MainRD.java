package workintech.com.main;
import workintech.com.rdmodel.CarSkeleton;
import workintech.com.rdmodel.ElectricCar;
import workintech.com.rdmodel.GasPoweredCar;
import workintech.com.rdmodel.HybridCar;




public class MainRD {
    public static void main(String[] args) {


            CarSkeleton gasCar = new GasPoweredCar("Gas Car", "This is a gas-powered car.", 10.5, 4);
            CarSkeleton electricCar = new ElectricCar("Electric Car", "This is an electric car.", 80.0, 100);
            CarSkeleton hybridCar = new HybridCar("Hybrid Car", "This is a hybrid car.", 15.0, 50, 2);

            testCar(gasCar);
            testCar(electricCar);
            testCar(hybridCar);
        }

    public static void testCar(CarSkeleton car) {
        System.out.println("Car name: " + car.getName());
        System.out.println("Description: " + car.getDescription());
        car.startEngine();
        car.drive();

        // Polymorphism sayesinde her bir alt sınıfın kendi özelliklerine ulaşabiliriz.
        if (car instanceof GasPoweredCar) {
            GasPoweredCar gasCar = (GasPoweredCar) car;
            System.out.println("Average km per litre: " + gasCar.getAvgKmPerLitre());
            System.out.println("Cylinders: " + gasCar.getCylinders());
        } else if (car instanceof ElectricCar) {
            ElectricCar electricCar = (ElectricCar) car;
            System.out.println("Average km per charge: " + electricCar.getAvgKmPerCharge());
            System.out.println("Battery size: " + electricCar.getBatterySize());
        } else if (car instanceof HybridCar) {
            HybridCar hybridCar = (HybridCar) car;
            System.out.println("Average km per litre: " + hybridCar.getAvgKmPerLitre());
            System.out.println("Battery size: " + hybridCar.getBatterySize());
            System.out.println("Cylinders: " + hybridCar.getCylinders());
        }
        System.out.println();
    }
    }

