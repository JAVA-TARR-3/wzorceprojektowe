package dekorator;

import java.io.*;

public class LowerCaseInputStreamProgram {

    public static void main(String[] args) throws IOException {

        String filePath = "/Users/mszupke/Documents/test.txt";
        InputStream inputStream =
                new LoweCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream(filePath)
                        )
                );

        int c;
        while ((c = inputStream.read()) >= 0) {
            System.out.print((char)c);
        }

        inputStream.close();
    }
}
