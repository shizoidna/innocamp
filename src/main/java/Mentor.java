import java.util.*;

public class Mentor extends Person implements Teachable{

   private Set<Student> students = new HashSet<>();
   private Set<String> subjects = new HashSet<>();

    Mentor(String name, Gender gender, String startDate) {
        super(name, gender, startDate);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }


    @Override
    public void know(String subject) {
        this.subjects.add(subject);
    }
}
