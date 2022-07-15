package training.io;

import java.io.*;

public class BufferedInputStreamExample {

    public static void main(String[] args) {
        BufferedInputStream inputStream = null;
        try {
        inputStream = new BufferedInputStream(System.in);
//        int c = 0;
//        try {
//           while((c = inputStream.read()) != '\n'){
//               System.out.print((char)c);
//            }
//        }catch(IOException ioe){
//            ioe.printStackTrace();;
//        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while((line = reader.readLine()).length() != 0){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
