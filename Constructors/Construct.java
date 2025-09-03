// Constructors: It is special method which is invoked automatically at the time of OBECT CREATION.
// Constructors have the same name as class or structure.
// Constructors don't have a return tye.(Not even Void).
// Constructors are only called once. at object creation.
// Memory allocation happens when Constructor is called.

package Constructors;

public class Construct {
    Student s1 = new Student("pallavi");
    
    System.out.println(s1.name);
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
        //System.out.println();
    }
}