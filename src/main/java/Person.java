import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {

    private int id;
    private String name;
    private Gender gender;
    private LocalDate startDate;

    static int counter = 0;

    Person(){
        this.id = ++counter;
    }

    Person(String name, Gender gender, String startDate) {
        this();
        this.name = name;
        this.gender = gender;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        this.startDate = LocalDate.parse(startDate,formatter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;

    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        this.startDate = LocalDate.parse(startDate,formatter);
    }

    public static void print() {
        System.out.println("static");
    }

    @Override
    public String toString() {
        return "Person{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", gender = " + gender +
                ", startDate = " + startDate +
                '}';
    }
}
