import java.util.List;
import java.util.Set;

public class Service {

    public Student addStudent(String name, int year, boolean isMale) {

        Student student = new Student();


        student.setName(name);
        student.setYear(year);
        student.setMale(isMale);

        return student;
    }

    public Mentor addMentor(String name, int year, boolean isMale) {

        Mentor mentor = new Mentor();

        mentor.setName(name);
        mentor.setYear(year);
        mentor.setMale(isMale);

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

        student.getMarks().add(mark);
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
            List<Integer> studentMarks = student.getMarks();//get all student's marks

            for(Integer mark: studentMarks){
                total += mark;//sum them up
            }

            marksCounter += studentMarks.size();//remember the quantity of the marks
        }//continue with the next student

        return Math.round(total/marksCounter*100)/100F;
    }
}
