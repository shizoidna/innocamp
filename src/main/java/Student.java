import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student extends Person implements Teachable {

    private Map<LocalDate, Integer> marks = new HashMap<>();
    private Pussy cat;
    private Set<String> certificates = new HashSet<>();

    Student(String name, Gender gender, String startDate) {
        super(name, gender, startDate);
    }

    public Map<LocalDate, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<LocalDate, Integer> marks) {
        this.marks = marks;
    }

    public void addCat(Pussy cat){
        this.cat = cat;
    }

    public Pussy getCat() {
        return cat;
    }

    public void setCat(Pussy cat) {
        this.cat = cat;
    }

    @Override
    public void know(String subject) {
        certificates.add(subject);
    }
}

