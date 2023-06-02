package Practicum.Arrays.Записи;

class Employee
{
    Employee(String x, String y)
    {
      x = "Hi";
      y = "Hello";
    }
    public static void main(String args[])
    {
        String name1 = new String("Alice");
        String name2 = new String("Mary");
        Employee a = new Employee(name1, name2);
        System.out.println("name1="+name1);
        System.out.println("name2="+name2);
    }
}
