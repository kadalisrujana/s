package training.io;

import java.io.*;

public class FileReaderExample {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("resources/StudentList.txt");
        File outputFile = new File("resources/StudentList-output.txt");
        int i = 0;
        //reader
        while(++i < 10) {
            InputStream inputStream = null;
            OutputStream outputStream = null;
            try {
                inputStream = new FileInputStream(file);
                //writer
                outputStream = new FileOutputStream(outputFile);
                int data = 0;
                while ((data = inputStream.read()) != -1) {
                    System.out.print((char) data);
                    outputStream.write(data);
                    throw new Exception();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }finally { //irrespective exception finally block is executed after try
                System.out.println("I am in finally block");
                try {
                    inputStream.close();
                    outputStream.close();
                } catch (IOException e) {
                   e.printStackTrace();
                }

            }
            System.out.println(Runtime.getRuntime().freeMemory());
        }
    }
}
