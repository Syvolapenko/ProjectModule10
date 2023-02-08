package hw10t1;

import java.io.*;
import java.util.Scanner;

public class CustomInputStreamTest {
    public static void main(String[] args) throws IOException {
//        InputStream sim = new CustomInputStream("Go Home!");
//        Scanner scanner = new Scanner(sim);
//        String res = scanner.nextLine();
//        System.out.println("res = " + res);

        File file = new File("text.txt");
        System.out.println("file.exists() = " + file.exists());
        if (file.exists()) {
            InputStream fim = new FileInputStream(file);
            Scanner scanner = new Scanner(fim);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String example1 = "^\\(\\d{3}\\)\\s\\d{3}-\\d{4}$";
                String example2 = "^\\d{3}-\\d{3}-\\d{4}$";
                if(line.matches(example1)||line.matches(example2))
                    System.out.println(line);
            }
            fim.close();
            scanner.close();
        }
    }
}
