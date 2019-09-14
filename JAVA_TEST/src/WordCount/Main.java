package WordCount;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by Оператор on 14.09.2019.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String string = in.nextLine();

        System.out.println("Введите слово");
        String string2 = in.nextLine();

        int count = 0;

        String[] words = string.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(string2)){
                count++;
            }
        }
        System.out.println(string2 + ": " + count);


    }
}
