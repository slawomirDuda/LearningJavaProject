package a4.InnerClasses;

public class Car {
    private static int counter = 0;
    public String model;

    public Car(String model){
        this.model = model;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
