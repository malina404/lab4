package optional;


import java.util.List;

public class School implements Comparable<School> {
     private String name;
    private static List<Student> schoolPreferences;
    private int capacity;

    public School(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
      }

    public String getName() { return name; }
    public int getCapacity() {
        return capacity;
    }
    public static List<Student> getSchoolPreferences() {
        return schoolPreferences;
    }

    public static void setSchoolPreferences(List<Student> schoolPreferences) {
        School.schoolPreferences = schoolPreferences;
    }

    @Override
    public int compareTo(School s) {
        return Integer.compare(this.capacity, s.getCapacity());
    }

    @Override
    public String toString() {
        return "  School{" +  "name='" + name +  ", capacity=" + capacity + '}';
    }
}
