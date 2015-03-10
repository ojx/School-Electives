import java.util.ArrayList;

//code for testing only - no need to edit this class
public class Main {
    public static void main(String[] args) {
        School school = new School("Lorne Park High");

        //create electives
        school.addElective(new Elective("Astronomy", 12));
        school.addElective(new Elective("Ballroom Dance", 20));
        school.addElective(new Elective("Basketweaving", 15));
        school.addElective(new Elective("Constitutional Law", 10));
        school.addElective(new Elective("Marine Biology", 10));
        school.addElective(new Elective("Programming", 30));

        //create students
        for (int i = 0; i < 95; i++) {
            school.addStudent(new Student(i));
        }
        school.addStudent(new Student("Andrew"));
        school.addStudent(new Student("David"));
        school.addStudent(new Student("Elizabeth"));
        school.addStudent(new Student("Ethan"));
        school.addStudent(new Student("Katherine"));

        //randomly generate student choices
        for (int i = 0; i < school.getStudentList().size(); i++) {
            int choice1 = (int)(Math.random() * school.getElectiveList().size());
            school.getStudentList().get(i).addChoice(school.getElectiveList().get(choice1));
            int choice2 = (int)(Math.random() * school.getElectiveList().size());
            while (choice1 == choice2)
                choice2 = (int)(Math.random() * school.getElectiveList().size());
            school.getStudentList().get(i).addChoice(school.getElectiveList().get(choice2));
            int choice3 = (int)(Math.random() * school.getElectiveList().size());
            while ((choice1 == choice3) || (choice2 == choice3))
                choice3 = (int)(Math.random() * school.getElectiveList().size());
            school.getStudentList().get(i).addChoice(school.getElectiveList().get(choice3));
        }

        if (school.isElectiveOffered("Ceramics")) {
            System.out.println("Ceramics is offered");
        } else {
            System.out.println("Ceramics is NOT offered");
        }

        if (school.isElectiveOffered("Marine Biology")) {
            System.out.println("Marine Biology is offered");
        } else {
            System.out.println("Marine Biology is NOT offered");
        }

        school.assignElectivesToStudents();

        System.out.println("\nStudents who have not been assigned:");
        ArrayList<Student> unassignedStudents = school.studentsWithoutElectives();
        if (unassignedStudents != null) {
            for (Student s : unassignedStudents) {
                System.out.println(s.getName());
            }
        }

        System.out.println("\nNumber of first choice assignments: " + school.firstChoicesAssigned());
    }
}
