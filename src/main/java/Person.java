public class Person {

    private int id;
    private String name;
    private boolean isMale;
    private int year;

    static int counter = 0;

    Person(){
        this.id = ++counter;
    }

    Person(String name, boolean isMale, int year) {
        this();
        this.name = name;
        this.isMale = isMale;
        this.year = year;
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

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1900 || year > 2019) {
            throw new IllegalArgumentException("Year should be in range [1900; 2019]");
        }

        this.year = year;
    }

    public static void print() {
        System.out.println("static");
    }
}
