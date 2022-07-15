package kavya.exceptions.july13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmployeeDetails {
    int id;
    String name;
    Date dob;
    String city;
    int salary;
    int hra;

    public EmployeeDetails(int id, String name, String dob, String city, int salary) {
        this.id = id;
        this.name = name;

        this.city = city;
        this.salary = salary;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.dob = format.parse(dob);
        } catch(NullPointerException npe){
            //set default date as todays date
            this.dob = new Date();
        }catch(Exception e){
            e.printStackTrace(); //supressing
        }

    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", hra=" + hra +
                '}';
    }


}

