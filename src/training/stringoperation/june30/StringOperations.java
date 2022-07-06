package training.stringoperation.june30;
public class StringOperations {
    
    final static String s4 = "Anurag"; //constant
    
    public static void main(String args[]) {
      String s1 = "Dhakshayani"; //Strings are immutable, once the value is created you can't modify it.
      String s2 = "Dhakshayani";
      String s3 = new String("Dhakshayani");
      
      
      
      //s4 = "Sumana"; //NOT ALLOWED final/constants can'be re-assigned.
      
      int t1 = 1;
      int t2 = 1;
      
      StringBuffer sb = new StringBuffer("Dhakshayani");//thread-safe
      sb.append(" is working in YLEMINC Tecnologies");
      
      
      StringBuilder sbuilder = new StringBuilder("Srujana").append(".  ");//non-thread-safe
      sbuilder.append(" is working in YLEMINC Tecnologies");
      
      System.out.println("Integer Comparision  :" + (t1 == t2));
      //== opearator in String just checks if memory reference is same or not.
      System.out.println("S1 = "+ s1);
      System.out.println("Its String Comparision :" + (s1 == s2));
      System.out.println("Its String Comparision. :" + (s1 == s3));
      
      
      System.out.println("Its String Comparision using euqals. :" + (s1.equals(s3)));
      
      System.out.println("String Buffer value :" + sb);
      
      System.out.println("String Builder value :" + sbuilder);
      
      
      //s1 = "Anurag";
      s1 = s2 + " Hi there";
      System.out.println("S1 = "+ s1);
      
      System.out.println("S1 length :" + s1.length());
      
      //iterate a string by character
      int i = 0;
      for(char c : s1.toCharArray()){ //s1.toCharArray() -> converts a string to a character array
            System.out.print(c);
            System.out.print(" ");
            i++;
            
      }
      System.out.println("Size of the string: "+ i);
      System.out.println();
      String subS1 = s1.substring(10);
      System.out.println("S1 Substring of 10 :" + subS1);
      
      String as1 = "saba begum S      SAVINGS      HYDERABAD ... SB."; 
      String as2 = "Kavya      C      CURRENT      HYDERABAD ... SB. ";
      String as3 = "Sumana     L      LOAN         HYDERABAD ... SB.";
      String subS2 = s1.substring(0, 11);
      System.out.println("S1 Substring of first 10 :" + subS2);
      
      //use substring to take a particular character
      System.out.println("Character using substring : " + as1.substring(12, 13));
      System.out.println("Character using substring : " + as2.substring(12, 13));
      
      System.out.println("Character using charAt : " + as1.charAt(12));
      
      //indexOf gives character location, if not found returns -1
      System.out.println("Is a there is the string :" + s1.indexOf('a'));
      System.out.println("Is . there is the string :" + s1.indexOf('.'));
      System.out.println("what is a position from last :" + s1.lastIndexOf('a'));
      
      
      System.out.println("Substring using indexOf :" + as1.substring(as1.indexOf('S')));
      System.out.println("Substring using indexOf :" + as1.substring(as1.indexOf('S', 20)));
      //substring operations using indexOf
      
      //count words in a sentense
      
      String sentence = "Hi we have java training program in YLEMINC, our class starts "+
                        "daily at 3:30PM.";
      String[] words = sentence.split(" ");
      System.out.println("Number of words in sentence is :" + words.length);
      
      System.out.println("Lowercase of s1 :" + s1.toLowerCase());
      System.out.println("Upper of s1 :" + s1.toUpperCase());
    }
}
