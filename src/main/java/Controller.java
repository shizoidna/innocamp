public class Controller {
    static  Service service = new Service();

    public static void main(String[] args) {
        fillData();
        System.out.println(service.getAllMentors());
    }

    public static void fillData() {
        Student alfred = service.addStudent("Alfred", "01-09-2019", Gender.MALE);
        Student masha = service.addStudent("Masha", "01-09-2018", Gender.FEMALE);
        Student misha = service.addStudent("Misha", "05-04-2018", Gender.MALE);

        Student evlampy = service.addStudent("Evlampy", "01-08-2019", Gender.MALE);

        Mentor ivanIvanovich = service.addMentor("Ivan Ivanovich",  Gender.MALE);
        Mentor pyotrIvanovich = service.addMentor("Pyotr Ivanovich", Gender.MALE);


        masha.addCat(new Pussy(3, "Smokey"));

        service.addStudentToMentor(pyotrIvanovich, alfred);
        service.addStudentToMentor(pyotrIvanovich, masha);

        service.addMark(pyotrIvanovich, alfred, 8);

        service.addMark(pyotrIvanovich, masha, 10);
    }
}
