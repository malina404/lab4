package optional;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem {
    static Faker faker = new Faker();
    private List<Student> studentList;
    private List<School> schoolList;

    public List<Student> getStudentList() {
        return studentList;
    }
    public List<School> getSchoolList() {
        return schoolList;
    }


    public static List<Student> generateStudents(int count) {
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < count; i++)
            studentList.add(new Student(faker.name().fullName(),
                    faker.number().randomDouble(2, 5, 10)));
        studentList.sort(Comparator.comparingDouble(Student::getGrade));
        School.setSchoolPreferences(studentList);
        return studentList;

    }

    public static List<School> generateSchools(int count) {
        List<School> schoolList = new ArrayList<>();
        for (int i = 0; i < count; i++)
            schoolList.add(new School(faker.university().name(), faker.number().numberBetween(1, 5)));
        return schoolList;
    }

    public void generateProblem() {
        schoolList = generateSchools(10);
        studentList = generateStudents(30);
    }

    public List<School> schoolsThatHaveGivenStudentFirst(Student student) {
        return (List<School>) schoolList.stream().filter(school -> student.equals(school.getSchoolPreferences().get(0)));
    }

}
