package a1.LoopsObjectsGetterSetter;

public class PersonBMI {

    private float BMI;
    private int height;
    private int weight;

    public float getBMI() {
        return BMI;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setHeight(int height) {
        this.height = height;
        this.BMI = (height/weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
        this.BMI = (height/weight);
    }

    public PersonBMI(int height, int weight) {
        this.height = height;
        this.weight = weight;
        this.BMI = (height/weight);
    }
}
