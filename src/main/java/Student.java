import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private List<Integer> marks = new ArrayList<>();

    Student() {

    }

    Student(String name, boolean isMale, int year) {
        super(name, isMale, year);
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }
}

