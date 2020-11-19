import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Построить частотный словарь(Map) символов английского или русского алфавита.
 * Для этого взять любой большой кусок текста и сохранить его в файле.
 * Соответственно в коде надо из файла читать.
 */
public class Task03 {

    public static void main(String[] args) {
        Map<Character, Integer> frequencies = new HashMap<Character, Integer>();
        try {
            File cur_text = new File("task03_checking.txt");
            Scanner cur_scanner = new Scanner(cur_text);
            
            while (cur_scanner.hasNextLine()) {
                String new_line = cur_scanner.nextLine();
                
                for (int i = 0; i < new_line.length(); ++i) {
                    if (frequencies.containsKey(new_line.charAt(i))) {
                        frequencies.put(new_line.charAt(i), frequencies.get(new_line.charAt(i)) + 1);
                    }
                    else {
                        frequencies.put(new_line.charAt(i), 1);
                    }
                }
            }
            
            cur_scanner.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong);
            e.printStackTrace();
        }
        
        System.out.println(frequencies);
    }

}
