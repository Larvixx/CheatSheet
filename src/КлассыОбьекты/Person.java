package КлассыОбьекты;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    protected String getFirstName(){ return firstName;

    }
   protected String getLastName() {
        return lastName;
    }
    protected int getAge(){return  age;}

     protected String getFullName(){
        return firstName + " " + lastName + " Возраст: " + age;
    }
}
