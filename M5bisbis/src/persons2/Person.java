package persons2;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name   = name;
        this.age    = age;
    }

    @Override
    public String toString(){
        return this.name + " : " + this.age + " ans";
    }

    public void display(){
        System.out.println(this.toString() + " - " + super.toString());
    }

    public String getName() { return this.name; }
    public int getAge()     { return this.age;  }
}
