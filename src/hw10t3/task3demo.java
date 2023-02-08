package hw10t3;

import java.io.*;
import java.util.*;

public class task3demo {
    public static void main(String[] args)  {
        ArrayList<String> wordsArr = new ArrayList<>();
        Map<String, Integer> words = new HashMap<String, Integer>();
        File fileNew = new File("sentence.txt");
        if (fileNew.exists()) {
            try (InputStream note = new FileInputStream(fileNew);
                 Scanner scannerNew = new Scanner(note)) {
                String word = "";
                String[] array = new String[0];
                while (scannerNew.hasNext()) {
                    String line = scannerNew.nextLine();
                    word =word +line +" ";
                    array = word.split(" ");
                }
                for (int i = 0; i < array.length; i++) {
                    String tempChar = array[i];

                    if (!words.containsKey(tempChar)) {
                        words.put(tempChar, 1);
                    } else {
                        words.put(tempChar, words.get(tempChar) + 1);
                    }
                }
                for (Map.Entry<String, Integer> entry : words.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = words.get(o1);
                Integer value2 = words.get(o2);
                return value1.compareTo(value2) > 0 ? 1 : -1;
            }
        };
    }
}

