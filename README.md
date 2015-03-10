#School Electives (ArrayLists)

![Electives!](electives.jpg)

In a certain school, students are permitted to enroll in one elective class from a list of electives offered. Because there are a limited number of spaces in each class for students, and because some electives are more popular than others, a lottery system was devised by the school to assign students to electives.

Each student lists three choices for electives. The school orders the students randomly and assigns each student to the first available elective in the student's list of three choices. If none of the three choices is available (because those electives are fully enrolled), the school does not assign the student to an elective.

After the school attempts to assign all of the students to electives, it produces a list of students it was unable to assign.

For example, suppose there are six electives available to students: _Astronomy_, _Ballroom Dance_, _Basketweaving_, _Constitutional Law_, _Marine Biology_, and _Programming_.

The following table shows the name, maximum enrollment, and current enrollment for six electives after 64 students have been successfully assigned to electives:

Elective Name|Maximum Enrollment|Current Enrollment
---|---|---
Astronomy|12|12
Ballroom Dance|20|3
Basketweaving|15|14
Constitutional Law|10|7
Marine Biology|10|10
Programming|30|30

Note that three electives, _Astronomy_, _Programming_, and _Marine Biology_, are fully enrolled and are no longer options for students.

Now suppose that, for example, the following students need to be assigned to electives:

Student|First Choice - `getChoice(O)`|Second Choice - `getChoice(1)`|Third Choice - `getChoice(2)`
---|---|---|---
Andrew|_Programming_|_Marine Biology_|_Ballroom Dance_
David|_Constitutional Law_|_Basketweaving_|_Programming_
Elizabeth|_Marine Biology_|_Programming_|_Astronomy_
Ethan|_Basketweaving_|_Marine Biology_|_Astronomy_
Katherine|_Programming_|_Basketweaving_|_Marine Biolog_

Andrew's first and second choices are fully enrolled, but his third choice has openings. Andrew will be enrolled
in _Ballroom Dance_.

David's first choice has openings. David will be enrolled in _Constitutional Law_.
All three of Elizabeth's choices are fully enrolled. Elizabeth will remain unassigned to an elective.

Ethan's first choice has one opening left. Ethan will be enrolled in _Basketweaving_. Note that _Basketweaving_ is
now fully enrolled.

All three of Katharine's choices are now fully enrolled. Katharine will remain unassigned to an elective.

In this problem, the school is modeled by the class `School`. Students and electives are modeled by the classes
`Student` and `Elective` respectively. Each class is described below:

##The `Student` Class

The `Student` class includes the following methods and private data:

* `getChoice` - This method returns the name of the given elective choice of the student. The first elective choice has index 0, the second has index 1, and the third has index 2.
* `hasElective` - This method returns `true` if the student has been assigned an elective; it returns `false` otherwise.
* `assignElective` - This method assigns the given elective to this student.

##The `Elective` Class

The `Elective` class includes the following methods:

* `getName` - This method returns the name of this elective.
* `getMaxClassSize` - This method returns the maximum number of students that can be assigned to this elective.
* `getClassSize` - This method returns the number of students that have been assigned to this elective.
* `addStudent` - This method assigns the given student to this elective.

##The `School` Class

Your assignment is to write four methods of the `School` class. The `School` class includes the following methods and private data:

* `studentList` - This `ArrayList` holds the list of students in the order in which the students should be scheduled.
* `electiveList` - This `ArrayList` holds the electives that students may choose.

###Part A

Complete the `isElectiveOffered` method, this should return `true` of `false` depending on if an `Elective` is in `electiveList`.

###Part B

Complete the `assignElectivesToStudents` method, this encapsulates the functionality of assigning students (if possible) their first, second, or third elective choice.

###Part C

Complete the `studentsWithoutElectives` method, this should return an `ArrayList` containing students that have not been assigned an elective.

###Part D

Complete the `firstChoicesAssigned` method, this should return the number of students who have been assigned their first choice.