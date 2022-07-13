package training.july13.exceptionhandling;

import java.util.Calendar;
import java.util.Random;

//test class
public class Main {

    public static void main(String[] args) {
        registerKavya();
        registerMike();
        registerTaylor();
    }

    private static void registerKavya() {
        //create a student and set values
        Student student = new Student();
        student.setName("Kavya");
        student.setGendar('F');
        student.setCourseCompleted("BSc");
        student.setTotalMarks(89);
        Calendar cal = Calendar.getInstance();
        cal.set(1995, 10 , 1);
        student.setDob(cal.getTime());

        //create application
        Application application = new Application();
        application.setCourse("MCA");
        application.setStudent(student);
        application.setId(new Random().nextInt()); //random class will give a random nuumber

        //call student registration and apply
        StudentRegistration studentRegistration  = new StudentRegistration();
        try {
            studentRegistration.registerForACourse(application);
        } catch (Exception e) {
            System.out.println("Student " + student.getName() + " registration is failed : "+ e.getMessage());
        }
    }


    private static void registerMike() {
        //create a student and set values
        Student student = new Student();
        student.setName("Mike");
        student.setGendar('M');
        student.setCourseCompleted("BSc");
        student.setTotalMarks(49);
        Calendar cal = Calendar.getInstance();
        cal.set(2000, 1 , 1);
        student.setDob(cal.getTime());

        //create application
        Application application = new Application();
        application.setCourse("MCA");
        application.setStudent(student);
        application.setId(new Random().nextInt()); //random class will give a random nuumber

        //call student registration and apply
        StudentRegistration studentRegistration  = new StudentRegistration();
        try {
            studentRegistration.registerForACourse(application);
        } catch (Exception e) {
            System.out.println("Student " + student.getName() + " registration is failed : "+ e.getMessage());
        }
    }


    private static void registerTaylor() {
        //create a student and set values
        Student student = new Student();
        student.setName("Taylor");
        student.setGendar('M');
        student.setCourseCompleted("BTech");
        student.setTotalMarks(99);
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 1 , 1);
        student.setDob(cal.getTime());

        //create application
        Application application = new Application();
        application.setCourse("MTech");
        application.setStudent(student);
        application.setId(new Random().nextInt()); //random class will give a random nuumber

        //call student registration and apply
        StudentRegistration studentRegistration  = new StudentRegistration();
        try {
            studentRegistration.registerForACourse(application);
        } catch (Exception e) {
            System.out.println("Student " + student.getName() + " registration is failed : "+ e.getMessage());
        }
    }
}
