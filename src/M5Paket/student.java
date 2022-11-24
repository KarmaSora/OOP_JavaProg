package M5Paket;

public class student extends Person {

    protected String Education;
    protected int Grade;
    /**
     * Konstruktor
     *
     * @param name
     * @param age
     */
    public student(String name, int age, String Education, int Grade) {
        super(name, age);
        this.Grade = Grade;
        this.Education = Education;

    }

    
    public String printInfo() {
       String info = super.printInfo()  + " Education: " + Education + "  Grade: " + Grade;
       return info;
    }
}
