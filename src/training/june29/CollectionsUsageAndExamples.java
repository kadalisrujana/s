package training.june29;
import java.util.*;

public class CollectionsUsageAndExamples {
    public static void main(String args[]) {
      //convert an array to list
      String students[] = {"Suamana", "Dhakshayani"};
      
      List<String> studentNameList = Arrays.asList(students);
      
      printNames(studentNameList);
      
      printArrayNames("Suamana", "Dhakshayani", "Srujana", "Shahid", "Anurag");
      
      //Sort list elements
     Collections.sort(studentNameList);
      
      System.out.println("Sorted list is :" + studentNameList);
      
    //   //Sort objects
      Student saba = new Student(1, "Saba");
      Student b = new Student(6, "Kavya");
      Student adfjald = new Student (10, "Dhakshayani");
      
      List<Student> studentList = Arrays.asList(adfjald, saba, 
                            b, new Student(4,"Srujana"), new Student(50,"Sravani"),
                            new Student(90, "Sumana"));
      
      System.out.println("Student names in List Before sort" + studentList);
      //sort objects
      Collections.sort(studentList);
      
      System.out.println("Student names in List" + studentList);
      
      //Sorting using Comparator
      Collections.sort(studentList, new StudentComparatr());
      System.out.println("Sorted using Comparator" +
                    "Student names in List" + studentList);
                    
        System.out.println("Saba".compareTo("kavya"));
    //   List<Student> studentList = new ArrayList<Student>();
    //   studentList.add(saba);
    //   studentList.add(b);
    //   studentList.add(adfjald);
      
      
    }
    
    
    public static void printNames(List<String> names){
        System.out.println("names :"+ names);
    }
    
    
    public static void printArrayNames(String... names){
        System.out.println("Printing names in array");
        for(String name: names){
            System.out.println(name);
        }
    }
}

class Student implements Comparable<Student>{
    int number;
    String name;
    
    public Student(int number, String name){
        this.number = number;
        this.name = name;
    }
    
    public int compareTo(Student argStudent){
        System.out.println("CompareTo");
        if(number > argStudent.number){
            return 1;
        }else if(number < argStudent.number){
            return -1;
        }
        return 0;
    }
    
    public String toString(){
        return String.format("Name : %s, Roll number: %s",name,number);
    }
    
}

class StudentComparatr implements Comparator<Student>{
    
    public int compare(Student a, Student b){
        
        System.out.println("Compare");
        return a.name.compareTo(b.name);
    }
}
