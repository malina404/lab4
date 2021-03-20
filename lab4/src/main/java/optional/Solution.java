package optional;

import java.util.*;

public class Solution {
    private Map<School, List<Student>> matching = new HashMap<>();
    private List<School> schoolsList = new ArrayList<School>();
    private List<Student> studentsList = new ArrayList<Student>();

    public Solution(List<School> schoolList, List<Student> studentList) {
        this.studentsList = studentList;
        this.schoolsList = schoolList;
    }

    public Map<School, List<Student>> getMatching() {
        return matching;
    }

    public Map<School, List<Student>> generateSolution() {

        for(int schoolId = 0, studentId = 0; schoolId < schoolsList.size(); schoolId++) {
            List<Student> acceptedStudents = new ArrayList<>();
            for(int accepted = 0; accepted< schoolsList.get(schoolId).getCapacity(); accepted++) {
                if (studentId >= studentsList.size()) break;
                if(schoolsList.get(schoolId).getSchoolPreferences().contains(studentsList.get(studentId)))
                acceptedStudents.add(studentsList.get(studentId++));
            }
            matching.put(schoolsList.get(schoolId), acceptedStudents);
        }
        return matching;
    }

}
