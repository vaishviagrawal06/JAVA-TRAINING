//1. Create a class Student with fields name, rollNumber, and marks. Write a method to display
//student details. Create 3 student objects and display their data.

 class Student{
    String name;
    double rollNumber;
    double marks;

    void display(){
        System.out.println("Name is "+name);
        System.out.println("rollNumber is "+rollNumber);
        System.out.println("marks is "+marks);
        System.out.println("-----------------");
    }

}

public class Main{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "arun";
        s1.rollNumber = 34;
        s1.marks = 78;

         Student s2 = new Student();
        s2.name = "arjun";
        s2.rollNumber = 64;
        s2.marks = 58;

       Student s3 = new Student();
        s3.name = "arpit";
        s3.rollNumber = 84;
        s3.marks = 68;

        s1.display();
        s2.display();
        s3.display();

    }

}
