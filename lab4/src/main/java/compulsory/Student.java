package compulsory;


public class Student implements Comparable<Student> {
    private String name;
    double grade;
    private School[] studentPreferences;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public School[] getStudentPreferences() {
        return studentPreferences;
    }

    public void setStudentPreferences(School[] studentPreferences) {
        this.studentPreferences = studentPreferences;
    }

    @Override
    public String toString() {

        return " Student{" + "name='" + name +  ", grade=" + grade +  '}';
    }

    @Override
    public int compareTo(Student s) {
        return Double.compare(this.grade, s.grade);
    }
}
