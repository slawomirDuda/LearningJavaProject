package a4.InnerClasses;

import java.util.ArrayList;

public class aMain {
    public static void main() {

//        STATIC/UNSTATIC COMBINATIONS (only for inner classes)

//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass2 myInner = myOuter.new InnerClass2();
//        System.out.println(myInner.y4);
//
//        OuterClass.InnerClass myInner2 = new OuterClass.InnerClass();
//        System.out.println(myInner2.y2);
//
//        OuterClass myOuter3 = new OuterClass();
//        System.out.println(OuterClass.InnerClass2.y3);
//
//        System.out.println(OuterClass.InnerClass.y1);

        ArrayList<Car> carsArrayList = new ArrayList<>();
        for(int i = 0; i<10; i++){
            carsArrayList.add(
                    new Car("ModelName ")
            );
        }
        System.out.println(Car.getCounter());
    }
}
