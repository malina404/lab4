package compulsory;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {


    private static List<Student> students = new LinkedList<>();
    private static Set<School> schools = new TreeSet<>();

    private static Map<Student, School[]> studentsPreferences = new HashMap<Student, School[]>();
    private static Map<School, Student[]> schoolPreferences = new TreeMap<School, Student[]>();

    public static void main(String[] args) {
        List<Double> grades = new ArrayList(Arrays.asList(8.00, 9.00, 7.00, 10.00));
        List<Integer> capacities = new ArrayList<>(Arrays.asList(1, 2, 2));
        students = IntStream.rangeClosed(0, 3).mapToObj(i -> new Student("S" + i, grades.get(i)))
                .collect(Collectors.toList());


        List<Student[]> schoolPreferencesList = new ArrayList<>();
        schoolPreferencesList.add(new Student[]{students.get(3), students.get(0), students.get(1), students.get(2)});
        schoolPreferencesList.add(new Student[]{students.get(0), students.get(2), students.get(1)});
        schoolPreferencesList.add(new Student[]{students.get(0), students.get(1), students.get(3)});

        schools = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new School("H" + i, capacities.get(i), schoolPreferencesList.get(i)))
                .collect(Collectors.toSet());

        students.get(0).setStudentPreferences(new School[]{(School) schools.toArray()[0], (School) schools
                .toArray()[1], (School) schools.toArray()[2]});
        students.get(1).setStudentPreferences(new School[]{(School) schools.toArray()[0], (School) schools
                .toArray()[1], (School) schools.toArray()[2]});
        students.get(2).setStudentPreferences(new School[]{(School) schools.toArray()[0], (School) schools
                .toArray()[1]});
        students.get(3)
                .setStudentPreferences(new School[]{(School) schools.toArray()[0], (School) schools.toArray()[0]});

        System.out.println("Students:");
        for (Student student : students)
            System.out.println(student);

        System.out.println("Schools:");
        for (School school : schools)
            System.out.println(school);

        System.out.println("Schools' preferences");

        for (Student student : students) {
            studentsPreferences.put(student, student.getStudentPreferences());
        }
        for (School school : schools) {
            System.out.print(school.getName() + "[ ");
            for (Student student : school.getSchoolPreferences()) {
                System.out.print(student.getName() + " ");
            }
            System.out.println("]");
        }

        System.out.println("Students' preferences");
        for (School school: schools)
        {
            schoolPreferences.put(school, school.getSchoolPreferences());
        }

        for (Student student: students)
        {
            System.out.print (student.getName()+"[ ");
            for (School school: student.getStudentPreferences())
                System.out.print (school.getName() + " ");
            System.out.println("]");
        }



    }


}
