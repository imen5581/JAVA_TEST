package HowManyTimesIsUsed;

import java.util.*;

/**
 * Created by Оператор on 14.09.2019.
 */
public class Main {
    public static void main(String[] args) {
        String message;
        System.out.println("Введите предложение: ");
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();

        List<String> arr = Arrays.asList(message.split(" "));

            Map<String, Integer> counter = new HashMap<>();
            for (String i : arr) {

                if (!i.isEmpty()) {
                    Integer count = counter.get(i);
                    if (count == null) {
                        count = 0;
                    }

                    counter.put(i, ++count);
                }
            }


            for (String j : counter.keySet()) {
                System.out.println(j + ": " + counter.get(j));
            }


        }
    }


