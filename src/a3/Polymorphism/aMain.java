package a3.Polymorphism;


import java.util.ArrayList;

public class aMain {
    public static void main() {
//        Animal myAnimal = new Animal();  //todo ABSTRACT cannot create object
        Animal myPig = new Pig();
        Animal myDog = new Dog();

//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();


        ArrayList<Animal> zbior = new ArrayList<Animal>();

        zbior.add(myPig);
        zbior.add(myDog);

        for (Animal zwierze : zbior) {
            zwierze.animalSound();
        }
    }
}



