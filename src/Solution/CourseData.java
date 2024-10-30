package Solution;

// CourseData holds course names and registrations, calculates totals, and checks if courses will run
public class CourseData
{
    private final String[] courseNames;     // Array to store course names
    private final int[][] registrations;    // 2D array to store registration figures for each course

    // Constructor to initialize course names and registrations
    public CourseData(String[] courseNames, int[][] registrations)
    {
        this.courseNames = courseNames;
        this.registrations = registrations;
    }

    // Method to get total registrations for a specific course
    public int getTotalRegistrations(int courseIndex)
    {
        int total = 0;

        for (int registration : registrations[courseIndex])
        {
            total += registration;
        }

        return total;
    }

    // Getter for course names
    public String getCourseName(int courseIndex)
    {
        return courseNames[courseIndex];
    }

    // Getter for the number of courses
    public int getNumberOfCourses()
    {
        return courseNames.length;
    }
}
