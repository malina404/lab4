package optional;


import java.util.*;

public class Main {


    private static List<Student> students = new LinkedList<>();
    private static Set<School> schools = new TreeSet<>();

    private static Map<Student, School[]> studentsPreferences = new HashMap<Student, School[]>();
    private static Map<School, Student[]> schoolPreferences = new TreeMap<School, Student[]>();

    public static void main(String[] args) {

        Problem problem=new Problem();
        problem.generateProblem();
        for (Student student : problem.getStudentList())
            System.out.println(student);
        for (School school : problem.getSchoolList())
            System.out.println(school);

        Solution solution=new Solution(problem.getSchoolList(), problem.getStudentList());
        solution.generateSolution();
        for (var entrySet : solution.getMatching().entrySet())
            System.out.println(entrySet.getKey().getName() + " " + entrySet.getValue());
    }
}
