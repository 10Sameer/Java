class Person {
    Person() {
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    Student() {
        super(); // calls parent constructor (implicit if not written)
        System.out.println("Student constructor");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
       Student s = new Student();
        /* Output:
           Person constructor
           Student constructor
        */
    }
}