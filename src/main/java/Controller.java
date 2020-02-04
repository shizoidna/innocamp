public class Controller {

    public static void main(String[] args) {
        Service service = new Service();

        Student alfred = service.addStudent("Alfred", 1996, true);
        Student masha = service.addStudent("Masha", 1997, false);

        Mentor pyotrIvanovich = service.addMentor("Pyotr Ivanovich", 1974, true);

        service.addStudentToMentor(pyotrIvanovich, alfred);
        service.addStudentToMentor(pyotrIvanovich, masha);

        service.addMark(pyotrIvanovich, alfred, 10);
        service.addMark(pyotrIvanovich, alfred, 8);
        service.addMark(pyotrIvanovich, alfred, 10);
        service.addMark(pyotrIvanovich, alfred, 8);

        service.addMark(pyotrIvanovich, masha, 12);
        service.addMark(pyotrIvanovich, masha, 12);
        service.addMark(pyotrIvanovich, masha, 4);


        System.out.println(service.countAverage(pyotrIvanovich));
    }
}
