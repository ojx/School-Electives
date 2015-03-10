import java.util.ArrayList;

//complete parts a, b, c & d in this class
public class School
{
    private String name;

    // each entry is an instance of a  Student representing one student at the school
    // students are in the order they should be scheduled
    private ArrayList<Student> studentList;

    // each entry is an instance of an Elective representing one elective offered at the school
    private ArrayList<Elective> electiveList;

    public School(String name) {
        this.name = name;
        studentList = new ArrayList<Student>();
        electiveList = new ArrayList<Elective>();
    }

    public void addStudent(Student stu) {
        studentList.add(stu);
    }

    public void addElective(Elective e) {
        electiveList.add(e);
    }

    // precondition: name is the name of an Elective in electiveList
    // post-condition: returns if an elective with the given name is in electiveList
    public boolean isElectiveOffered(String name) {
        /* to be implemented in part (a) */

        return false; //remove this line
    }

    // post-condition: All Students in studentList who have not been assign an elective are
    // assigned based on their choices (first choice, if full then second choice etc).
    // All Electives in electiveList have been updated appropriately as Students are assigned
    public void assignElectivesToStudents() {
        /* to be implemented in part (b) */

    }

    // post-condition: returns a list of those Students who have not been assigned an Elective
    public ArrayList<Student> studentsWithoutElectives() {
        /* to be implemented in part (c) */

        return null; //remove this line
    }

    // post-condition: returns the number of students who have been assigned their first choice elective
    public int firstChoicesAssigned() {
        /* to be implemented in part (d) */

        return 0; //remove this line
    }

    //getter methods below
    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Elective> getElectiveList() {
        return electiveList;
    }
}