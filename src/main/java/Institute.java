import java.util.ArrayList;
import java.util.List;

public class Institute {

    private List<Mentor> mentors = new ArrayList<>();

    private static final Institute instance = new Institute();

   private Institute(){}

   public static Institute getInstance() {
       return instance;
   }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }
}
