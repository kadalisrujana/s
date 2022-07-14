package training.exceptionhandling.july13;



import training.exceptionhandling.july14.RegistrationException;

import java.util.Calendar;
import java.util.Date;

public class Criteria {


    /**
     * 1. totalMarks > 50
     * 2. age > 18
     * 3. if application.course = MCA then courseCompleted in ('BCA', 'BSC', 'BCOM', MSC', 'BTECH')
     * 4. If application.course = MCA then courseCompleted = BSC
     * 5. If application.course = MTech then courseCompleted = BTech
     * @param application
     * @return
     */
    public boolean apply(Application application) throws Exception {
        boolean isSuccesful = false;
        Student student = application.getStudent();
        if(student.getTotalMarks() > 50){
            Date dob = student.getDob();
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -18);
            Date ageDate = calendar.getTime();

            if(dob.before(ageDate)){ //comparison of dates
                if(CourseCatelogue.getCourseList().contains(application.getCourse())){
                    isSuccesful = true;
                }else{
                    throw new Exception( "Student course is not listed");
                }
            }else{
                throw new RegistrationException(200, "Student is too young for this course");
            }
        }else{
            throw new RegistrationException(300, "Minimum marks required is : 50");
        }
        return isSuccesful;
    }

    public static void main(String[] args) {
//        Calendar cal = Calendar.getInstance();
//        cal.set(1990, 10, 10);
//        Date dob = cal.getTime();
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR, -18);
//        Date ageDate = calendar.getTime();
//
//        if(dob.before(ageDate)){ //comparison of dates
//            System.out.println("1990 is older than" + ageDate);
//        }

        int a = 0;
        int b = 20;
//        try {
            int c = b / a;
            System.out.println(c);
//        }catch(Exception e){
//            System.out.println("Exception thrown : " + e.getMessage());
//        }

    }
}
