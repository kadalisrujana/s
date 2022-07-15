package training.io;


import java.io.File;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReaderExample {

    public static void main(String[] args) {
        //readFilesThroughByteStream();
        readFilesThroughCharStream();
    }


    private static void readFilesThroughCharStream() {
        File file = new File("resources/StudentList.txt");
        File outputFile = new File("resources/StudentList-outputcharstream.txt");
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(file);
            writer = new FileWriter(outputFile);
            int c ;
//            c = reader.read();
            while((c = reader.read()) != -1) {
                System.out.print((char)c);
                writer.write(c);
            }
        }catch(FileNotFoundException fne) {
            fne.printStackTrace();
        }catch(IOException io){
            io.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static void readFilesThroughByteStream() {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("resources/StudentList.txt");
        File outputFile = new File("resources/StudentList-output.txt");
        int i = 0;
        //reader
        while (++i < 10) {
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
            } finally { //irrespective exception finally block is executed after try
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
