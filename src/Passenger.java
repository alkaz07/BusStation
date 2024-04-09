public class Passenger {
    private String name;
    private int age;
    private double weight;

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public Passenger(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
