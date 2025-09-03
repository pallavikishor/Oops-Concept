// Constructors: It is special method which is invoked automatically at the time of OBECT CREATION.
// Constructors have the same name as class or structure.
// Constructors don't have a return tye.(Not even Void).
// Constructors are only called once. at object creation.
// Memory allocation happens when Constructor is called.


// Types of Constructor
// 1. Non-parameterized: No arguments, sets default values.
// 2. Parameterized: Takes arguments, sets custom values.
// 3. Copy Consstructor: Create new object by copying another object.
package Constructors;

public class Construct {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("pallavi");
        Student s3 = new Student(123);
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;
    Student() {
        System.out.println("Constructor is called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}


