class Scratch {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mrs. Jones", 32, 15, "English");
        System.out.println(teacher);
        teacher.recordAttendance("Present");
        teacher.performDuties();

        Student student = new Student("David", 15, 13227);
        System.out.println(student);
        student.recordAttendance("Late");
        student.performDuties();

        Person[] people = {
                new Teacher("Mr. Tailor", 27, 52278, "Science"),
                new Teacher("Miss Smith", 34, 5343, "Art"),
                new Student("Sarah", 14, 14345),
                new Student("Chris", 12, 14234),
                new Student("Lucy", 17, 13453)
        };

        for (Person p : people) {
            System.out.println(p);
            p.recordAttendance("Absent");
            p.performDuties();
        }
    }
}

abstract class Person {
    String name, role;
    int age;

    public Person(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    void recordAttendance(String status) {
        System.out.println("ATTENDANCE: " + status);
    }

    abstract void performDuties();
}

class Teacher extends Person {
    int employeeId;
    String subject;

    public Teacher(String name, int age, int employeeId, String subject) {
        super(name, "Teacher", age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override
    void performDuties() {
        System.out.println("<Teaches " + subject + ">");
    }
}

class Student extends Person {
    int studentId;

    public Student(String name, int age, int studentId) {
        super(name, "Student", age);
        this.studentId = studentId;
    }

    @Override
    void performDuties() {
        System.out.println("<Studies ...>");
    }
}