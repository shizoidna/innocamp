import java.util.Objects;

public class Pussy {

    public static int id = 0;

    {
        id = 0;
    }

    int age;
    String name;

    public Pussy() {
    }

    public Pussy(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Pussy created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pussy pussy = (Pussy) o;
        return age == pussy.age &&
                Objects.equals(name, pussy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Name: " + name + "age: " + age + ".";
    }
}
