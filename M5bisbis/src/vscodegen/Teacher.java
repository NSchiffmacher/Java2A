package vscodegen;

public class Teacher extends Person{

    public Teacher(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }
    private String specialty;

    public String getSpecialty() {
        return this.specialty;
    }

    @Override
    public String toString() {
        return "{" +
            " specialty='" + getSpecialty() + "'" +
            "}";
    }

    
}
