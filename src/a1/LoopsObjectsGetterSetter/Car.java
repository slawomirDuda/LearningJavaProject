package a1.LoopsObjectsGetterSetter;

public class Car {
    public int hp;
    public String name;
    public boolean isLpg;

    public void printMe(){
        System.out.println(hp);
        System.out.println(name);
        System.out.println(isLpg);
    }

    public static void printCarManual(){
        System.out.println("This is manual for car");
    }

    public Car(){
        this.hp = 0;
        this.name = "placeholder";
        this.isLpg = false;
    }

    public Car(int hp, String name, boolean isLpg){
        this.hp = hp;
        this.name = name;
        this.isLpg = isLpg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", name='" + name + '\'' +
                ", isLpg=" + isLpg +
                '}';
    }
}
