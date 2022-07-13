package training.july13.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class CourseCatelogue {

    //1. initializing a list with default values
    //2. making this as final so that it can't be re-assigned
    private static final List<String> courseList = new ArrayList<>(){
        {
            add("Msc");
            add("Bsc");
            add("BCom");
            add("BCA");
            add("MCA");
            add("BTech");
            add("BE");
            add("MTech");
        }
    };

    public static List<String> getCourseList(){
        //courseList = new ArrayList<>(); can't be reassigned as it is declared as final
        return courseList;
    }
}
