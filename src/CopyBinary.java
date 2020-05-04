import java.io.*;

public class CopyBinary {

    public static void  copyBinaryExample(File source, File dest) throws IOException{
        InputStream inputStream = null;

        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);

            int length;
            byte[] buffer = new byte[1024];

            while ((length=inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
        } catch (IOException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws IOException {

        String input = "test1.txt";
        String output = "test2.txt";

        File source = new File(input);
        File dest = new File(output);


        copyBinaryExample(source,dest);
        System.out.println("Done!");
    }
}
