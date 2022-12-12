import exam.Department;
import exam.Person;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Hiel","Test",5);
        Person p2 = new Person("Gut","DD",3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        Department d1 = new Department("Hello world");
        Department d2 = new Department("Daily");
        d1.addStaff("Test","Heed",2);
        d1.addStaff("Hamm","Head",2);
        d1.addStaff("Hamm","Head",4);
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(Arrays.toString(d1.getAllTypes()));
        System.out.println(Arrays.toString(d2.getAllTypes()));

    }
}