//do not change this class
public class Elective
{
    private String name;
    private int classSize;
    private Student[] students;

    public Elective(String name, int maxClassSize) {
        this.name = name;
        students = new Student[maxClassSize];
    }

    // post-condition: returns the name of this Elective
    public String getName()  {
        return name;
    }

    //post-condition: returns the maximum number of Students that can be added to this Elective
    public int getMaxClassSize() {
        return students.length;
    }

    // post-condition: returns the number of Students that have been added to this Elective;
    // 0 <= getClassSize() <= getMaxClassSize()
    public int getClassSize() {
        return classSize;
    }

    // pre-condition: getClassSize() < getMaxClassSize () ; s is not null
    // post-condition: s has been added to this Elective; getClassSize () has been increased by 1
    public void addStudent(Student s) {
        if (classSize < students.length) {
            students[classSize++] = s;
        }
    }
}