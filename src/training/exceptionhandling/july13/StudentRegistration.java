package training.exceptionhandling.july13;

import training.exceptionhandling.july14.RegistrationException;

public class StudentRegistration {

    public boolean registerForACourse(Application application) throws Exception {
        System.out.println("Application is recieveid for " + application.getStudent().getName());
        Criteria criteria = new Criteria();
        boolean result = criteria.apply(application);
        if(result){
            System.out.println("Application is accepted for " + application.getStudent().getName());
        }
        return result;
    }
}
