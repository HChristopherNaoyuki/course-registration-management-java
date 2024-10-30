package Solution;

// DataDisplay handles the display of course data including totals and course status
public class DataDisplay
{
    // Method to display course information including total registrations and run status
    public void showCourseData(CourseData courseData)
    {
        // Header with aligned column names
        System.out.printf("%-20s %-15s %-15s\n", "COURSE", "STUDENT NUMBERS", "DELIVER COURSE");
        System.out.println("-----------------------------------------------------------");

        // Loop through each course to calculate and display its total registrations and status
        for (int i = 0; i < courseData.getNumberOfCourses(); i++)
        {
            String courseName = courseData.getCourseName(i);
            int numberOfStudents = courseData.getTotalRegistrations(i);
            String status = numberOfStudents >= 70 ? "Yes" : "No"; // Check if course runs based on student numbers

            // Print formatted course information
            System.out.printf("%-20s %-15d %-15s\n", courseName, numberOfStudents, status);
        }

        System.out.println("-----------------------------------------------------------");
    }
}
