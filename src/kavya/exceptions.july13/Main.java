package kavya.exceptions.july13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
        EmployeeDetails s1 = new EmployeeDetails(1,"saba", "1990-12-12", "Hyderabad", 40000);
        EmployeeDetails s2 = new EmployeeDetails(2, "Tanya", "1980-12-12", "Ahammadabad", 50000);
        EmployeeDetails s3 = new EmployeeDetails(3, "Sravya", "1989-10-12", "Bangalore", 10000);
        EmployeeDetails s4 = new EmployeeDetails(4, "Mike", null, "Hyderabad", 60000);
        EmployeeDetails s5 = new EmployeeDetails(5, "Taylor", "1988-12-12", "Delhi", 50000);
        EmployeeDetails s6 = new EmployeeDetails(6, "Mark", "1989-07-07", null, 70000);
        EmployeeDetails s7 = new EmployeeDetails(7, "Alex", "1985-12-12", "Mumbai", 150000);
        EmployeeDetails s8 = new EmployeeDetails(1,"Srinivas", "1985-10-04", "Rajahmundry", 95000);
        EmployeeDetails s9 = new EmployeeDetails(1,"vishnu", "1995-06-12", "Hyderabad", 40000);
        EmployeeDetails s10 = new EmployeeDetails(1,"Rajesh", "1996-30-08", "Hyderabad", 60000);
        employeeDetailsList.add(s1);
        employeeDetailsList.add(s2);
        employeeDetailsList.add(s3);
        employeeDetailsList.add(s4);
        employeeDetailsList.add(s5);
        employeeDetailsList.add(s6);
        employeeDetailsList.add(s7);
        employeeDetailsList.add(s8);
        employeeDetailsList.add(s9);
        employeeDetailsList.add(s10);

        //foreach loop syntax
        //for(Type variableName : Collection){ }
        for(EmployeeDetails  emp: employeeDetailsList) {
            int grade = 0;
            if(emp.salary > 10000 && emp.salary<20000){
                grade=4;
            }else  if(emp.salary > 20000 && emp.salary<40000){
                grade=3;
            }else  if(emp.salary > 40000 && emp.salary<65000){
                grade=2;
            }else  if(emp.salary > 650000){
                grade=1;
            }
            try {
                if (grade == 1) {
                    if ((emp.city.equals("Mumbai") || emp.city.equals("Banglore") || emp.city.equals("Delhi")))
                        emp.hra = emp.salary * 50 / 100;
                    else
                        emp.hra = emp.salary * 40 / 100;
                } else {
                    if ((emp.city.equals("Mumbai") || emp.city.equals("Banglore") || emp.city.equals("Delhi")))
                        emp.hra = emp.salary * 45 / 100;
                    else
                        emp.hra = emp.salary * 40 / 100;

                }
            }catch(NullPointerException npe){
                emp.hra = emp.salary*10/100;
            }
            System.out.println(emp);

        }

    }

}