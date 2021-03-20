package compulsory;

public class School implements Comparable<School> {
    private String name;
    private Student[] schoolPreferences;
    private int capacity;


    public School(String name, int capacity, Student[] schoolPreferences) {
        this.name = name;
        this.capacity = capacity;
        this.schoolPreferences=schoolPreferences;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getSchoolPreferences() {
        return schoolPreferences;
    }

    public void setSchoolPreferences(Student[] schoolPreferences) {
        this.schoolPreferences = schoolPreferences;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
