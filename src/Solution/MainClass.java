package Solution;

// MainClass initializes and executes the student registration application
public class MainClass
{
    public static void main(String[] args)
    {
        // Initialize an array of courses
        String[] courseNames = {"Programming 101", "Web Dev 101", "Databases 101", "Logic 101", "Management 101"};

        // Initialize a 2D array to store registration numbers for each course
        int[][] registrations =
        {
            {50, 10, 50},  // Programming 101 registrations
            {10, 50, 20},  // Web Dev 101 registrations
            {10, 10, 20},  // Databases 101 registrations
            {10, 7, 5},    // Logic 101 registrations
            {30, 10, 50}   // Management 101 registrations
        };

        // Create an instance of CourseData with initialized course names and registrations
        CourseData courseData = new CourseData(courseNames, registrations);

        // Display the course registration totals and status using DataDisplay
        DataDisplay display = new DataDisplay();
        display.showCourseData(courseData);
    }
}
