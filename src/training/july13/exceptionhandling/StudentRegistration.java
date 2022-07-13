package training.july13.exceptionhandling;

public class StudentRegistration {

    public boolean registerForACourse(Application application) throws Exception{
        System.out.println("Application is recieveid for " + application.getStudent().getName());
        Criteria criteria = new Criteria();
        boolean result = criteria.apply(application);
        if(result){
            System.out.println("Application is accepted for " + application.getStudent().getName());
        }
        return result;
    }
}
