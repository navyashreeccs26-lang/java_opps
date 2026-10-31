class Student {
    String name;
    int rollNo;
    int age;
    double marks;

    // Constructor
    Student(String name, int rollNo, int age, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Rahul", 101, 20, 85.5),
            new Student("Priya", 102, 19, 90.0),
            new Student("Amit", 103, 21, 78.5),
            new Student("Sneha", 104, 20, 88.0)
        };

        System.out.println("Student Details");
        System.out.println("====================");

        for (Student s : students) {
            s.display();
        }
    }
}