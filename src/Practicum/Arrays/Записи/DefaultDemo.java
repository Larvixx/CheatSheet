package Practicum.Arrays.Записи;
import java.util.Arrays;

class DefaultDemo
{
    DefaultDemo(String s)
    {
        System.out.print("DefaultDemo(String)");
    }
 DefaultDemo(int... v)
 {
     for (int i = 0; i < v.length; i++) {
         System.out.println(v[i]);

     }
     System.out.println("Сумма "+Arrays.stream(v).sum());

 }


    public static void main(String args[])
    {
        DefaultDemo dd = new DefaultDemo(1,12,354,4,646,56,34,422,34,32,4,24,523,2,234,234,324,342,2,37,32);
    }
}