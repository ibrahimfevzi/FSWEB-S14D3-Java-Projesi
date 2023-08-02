package workintech.com.main;
import workintech.com.pacificmodel.Car;
import workintech.com.pacificmodel.Ford;
import workintech.com.pacificmodel.Holden;
import workintech.com.pacificmodel.Mitsubishi;


public class Main {
    public static void main(String[] args) {

        System.out.println("***************Pacific Model*******************");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("**********************************************");
    }
}
