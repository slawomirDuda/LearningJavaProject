package a5.Interfaces;

public interface Animal {
    public static int x = 5;
    public void animalSound(); // interface method (does not have a body)
    public default void sleep(){
        System.out.println("default body");
    }; // interface method (does not have a body)
}
