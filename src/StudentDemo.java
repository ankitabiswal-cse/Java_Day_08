class Student{
    String name;
    int age;

    Student() {
        name = "Ankita Biswal";
        age = 19;
    }

        void display(){
        System.out.println("Name ="+name);
        System.out.println("Age ="+age);

    }
}
public class StudentDemo {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.display();
    }
}
