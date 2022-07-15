package training.io;

import java.io.*;

public class ConsoleIOExample {

    public static void main(String[] args) {
//        readDateFromSystemIn();
        readDateFromFile();
    }

    private static void readDateFromFile(){
        System.out.println("Hi"); //output uses printStream

        Reader reader = null;
        char[] myinputs = new char[10000000];
        try{
            reader = new InputStreamReader(new FileInputStream("resources/StudentList.txt"));
//            System.out.println("Enter \"Return\" to quit");
            int c;

            int i = 0;
            do{
                c =  reader.read();
                System.out.print((char)c);
//                myinputs[i++] = c;
            }while(c != -1);
        }catch(IOException io){
            io.printStackTrace();
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        System.out.println(new String(myinputs));
    }

    private static void readDateFromSystemIn(){
        System.out.println("Hi"); //output uses printStream

        Reader reader = null;
        char[] myinputs = new char[100];
        try{
            reader = new InputStreamReader(System.in);
            System.out.println("Enter \";\" to quit");
            char c;

            int i = 0;
            do{
                c = (char) reader.read();
                myinputs[i++] = c;
            }while(c != ';'); // \n is a new line or return key character
        }catch(IOException io){
            io.printStackTrace();
        }
        finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(new String(myinputs));
    }
}
