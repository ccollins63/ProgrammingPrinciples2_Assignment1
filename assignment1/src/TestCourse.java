//Cameron Collins

public class TestCourse
{
    public static void main(String args[])
    {
        //creates course objects
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        //adds students to the ArrayList for both courses
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        //displays the number of students in course object
        System.out.println("Number of students in " + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] course1Students = course1.getStudents();

        //displays students name in course object
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
        {
            System.out.print(course1Students[i] + ", ");
        }

        System.out.println();
        System.out.println();

        //displays the number of students in course object
        System.out.print("Number of students in " + course2.getCourseName() + ": " + course2.getNumberOfStudents());
        String[] course2Students = course2.getStudents();
        System.out.println();

        //displays students name in course object
        for (int i = 0; i < course2.getNumberOfStudents(); i++)
        {
            System.out.print(course2Students[i] + ", ");
        }
    }
}
