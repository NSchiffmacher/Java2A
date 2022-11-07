package persons;

public class PersonsMain {
    public static void main(String[] args) {
        Person person = new Person("Asterix", 32);
        System.out.println(person.getClass());
        System.out.println(Integer.toHexString(person.hashCode()));
        System.out.println(person.toString());

        person.display();
    }
}
