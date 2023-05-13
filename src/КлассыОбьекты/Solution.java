package КлассыОбьекты;

public class Solution {
    public static void main(String[] args) {
        Person person = new Person("Андрей", "Веселов",42);
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
        System.out.println(person.getAge());

    }
}
