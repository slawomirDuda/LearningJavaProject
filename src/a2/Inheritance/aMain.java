package a2.Inheritance;

public class aMain {
    public static void main() {
        a2.Inheritance.Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);

        Vehicle myVehicle = new Vehicle();
//        System.out.println(myVehicle.modelName); //todo error

        Vehicle myVehicle3;
        myVehicle3 = new Car();

        Vehicle myVehicle2;
        myVehicle2 = new Car();


//        String s1 = 2;    //todo error
    }
}
