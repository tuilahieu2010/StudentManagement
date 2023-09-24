
package model;

/**
 *
 * @author PC
 */
public class CourseOfStudent {
    private int id;
    private String semester;
    private String courseName;

    public CourseOfStudent(int id, String semester, String courseName){
        this.id= id;
        this.semester = semester;
        this.courseName = courseName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}