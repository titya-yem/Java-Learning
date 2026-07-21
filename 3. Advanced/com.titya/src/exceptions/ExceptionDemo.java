package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {
      public static  void show () {
          var account = new Account();
          try {
              account.withdraw(10);
          } catch (AccountException e) {
              e.printStackTrace();
          }
      }

//    public static void show () throws IOException {
//        var account = new Account();
//
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//            throw e;
//        }
//    }

//    public static void show () {
//        try (var reader = new FileReader("file.txt")) {
//            var value = reader.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
