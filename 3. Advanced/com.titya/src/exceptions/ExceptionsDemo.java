package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show () {
        try {
            var reader = new FileReader("file.txt");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
