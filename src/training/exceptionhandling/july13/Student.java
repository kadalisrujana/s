package training.exceptionhandling.july13;

import java.util.Date;

public class Student {

    private String name;

    private Date dob;

    private char gendar;

    private int totalMarks;

    private String courseCompleted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGendar() {
        return gendar;
    }

    public void setGendar(char gendar) {
        this.gendar = gendar;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public String getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
}
