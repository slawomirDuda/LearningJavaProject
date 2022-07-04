package a1.LoopsObjectsGetterSetter;

public class Person {

    public String name;
    public String surname;
    public int age;
    private boolean hetero;

    public void printMe(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(hetero);
    }

    public boolean getHetero(){
        return this.hetero;
    }

    public void setHetero(boolean userHetero){
        if(this.name == "Slawek"){
            //nothimg
        } else {
            this.hetero = userHetero;
        }
    }



    public Person(){
        this.name = "abcd";
        this.surname = "placeholder";
        this.age = 12;
        this.hetero = false;
    }

    public Person(String name, String surname, int age, boolean hetero){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hetero = hetero;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
