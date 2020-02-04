public class Cat extends Pussy {

    int weight;

    public Cat(int age, String name, int weight) {
        super(age, name);
        this.weight = weight;
        System.out.println("Cat created");

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
