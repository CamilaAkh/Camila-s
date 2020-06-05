package homework18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {

            File inputFile = new File("inputfile.txt");
            if (!inputFile.exists()) {
                inputFile.createNewFile();
            }
            File outputFile = new File("outputfile.txt");
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            FileInputStream is = new FileInputStream(inputFile);
            FileOutputStream os = new FileOutputStream(outputFile);

            byte[] buf = new byte[is.available()];
            is.read(buf);
            is.close();

            String string = new String(buf,"Windows-1251");

            os.write(string.getBytes("ISO-8859-1"));
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
