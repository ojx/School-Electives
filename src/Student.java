//do not change this class
public class Student
{
    private String name;
    private Elective[] choices;
    private Elective assigned;

    public Student(String name) {
        this.name = name;
        choices = new Elective[3];
    }

    public Student(int i) {
        if (Math.random() < 0.5)
            name = "Jane Doe #" + i;
        else
            name = "Bob Doe #" + i;
        choices = new Elective[3];
    }

    public void addChoice(Elective e) {
        int i = 0;
        while ((i < choices.length) && (choices[i] != null))
            i++;

        if (i < choices.length)
            choices[i] = e;
    }


    // precondition: 0 <= index < 3
    // post-condition: returns the name of the given elective choice
    public String getChoice(int index) {
        return choices[index].getName();
    }

    // post-condition: returns true if an Elective has been assigned to this Student
    public boolean hasElective () {
        return assigned != null;
    }

    // precondition: e is not null
    // post-condition: e has been assigned to this Student;
    public void assignElective(Elective e) {
        assigned = e;
    }

    public Elective getAssignedElective() {
        return assigned;
    }

    public String getName() {
        return name;
    }
}
