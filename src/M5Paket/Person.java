package M5Paket;

public class Person {
    protected String name;
    protected int age;

    /** Konstruktor */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /** Åtkomstmetod, set-metod */
    public void setAge(int age){
        this.age = age;
    }

    /** Åtkomstmetod, get-metod */
    public int getAge(){
        return this.age;
    }

    public String printInfo(){
        String info = "Namn: " + name + " age: " + age + " ";
        return info;
    }
}

