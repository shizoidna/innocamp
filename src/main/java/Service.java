import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Service {

    public Student addStudent(String name, String startDate, Gender gender) {
        return new Student(name, gender, startDate);
    }

    public Mentor addMentor(String name, Gender gender) {
        Institute institute = Institute.getInstance();

        Mentor mentor = new Mentor();

        mentor.setName(name);
        mentor.setGender(gender);

        institute.getMentors().add(mentor);

        return mentor;
    }

    public Mentor addStudentToMentor(Mentor mentor, Student student) {
        if(mentor == null ) {
            throw new IllegalArgumentException("Mentor cannot bne null");
        }

        if(student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }

        Set<Student> students = mentor.getStudents();
        students.add(student);
        return mentor;
    }

    public Student addMark(Mentor mentor, Student student, int mark) {
        if(student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }

        if(mark < 1 || mark > 12) {
            throw new IllegalArgumentException("Mark should be in the range [1;12]");
        }

        if(!mentor.getStudents().contains(student)) {
            throw new IllegalArgumentException("Mentor " + mentor.getName() + " does not have student " + student.getName());
        }

        LocalDate currentDate = LocalDate.now();

        if(student.getCat() != null) {
            mark *= 1.2;
        }

        student.getMarks().put(currentDate, mark);
        return student;
    }

    public float countAverage(Mentor mentor) {
        if(mentor == null) {
            throw new IllegalArgumentException("Mentor cannot be null");
        }

        float total = 0F;
        float marksCounter = 0f;

        Set<Student> allStudents = mentor.getStudents();

        for(Student student: allStudents){//for each mentor's student
            List<Integer> studentMarks = new ArrayList<>(student.getMarks().values());//get all student's marks

            for(Integer mark: studentMarks){
                total += mark;//sum them up
            }

            marksCounter += studentMarks.size();//remember the quantity of the marks
        }//continue with the next student

        float result;
        try {
            float midResult = total/marksCounter;
            result = Math.round(midResult*100)/100F;
        } catch (ArithmeticException e) {
            throw new InstituteException("Cannot divide by zero", e);
        }

        return result;
    }

    public List<Mentor> getAllMentors() {
        Institute institute = Institute.getInstance();
        return institute.getMentors();
    }
}
