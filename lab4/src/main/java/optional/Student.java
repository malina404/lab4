package optional;


public class Student implements Comparable<Student> {
    private String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name ;
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(this.grade, s.grade);
    }
}
