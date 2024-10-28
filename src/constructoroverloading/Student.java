package constructoroverloading;

public class Student {

    int id;
    String name;
    int age;

    //creating two arg constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
