package NokOrNod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Оператор on 14.09.2019.
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        String key2;
        while (true) {
            Thread.sleep(3000);
            System.out.println("Введите 2 числа:");
            key = reader.readLine();
            key2 = reader.readLine();
            if (key.isEmpty() | key2.isEmpty()){
                System.out.println("Ошибка ввода чисел. Повторите!");
                continue;
            }
            if (key.equals("exit")) {
                System.out.println("До скорой встречи!");
                break;
            }
            double number1 = Double.valueOf(key);
            double number2 = Double.valueOf(key2);
            if (number1%1 !=0 | number2%1 !=0){
                System.out.println("Одно из чисел не является целым!");
                continue;
            }

            System.out.println("НОД: "+ nod(number1, number2));
            System.out.println("НОК: "+ nok(number1,number2));
        }


    }

    static double nod(double a,double b){
        return b == 0 ? a : nod(b,a % b);
    }

    static double nok(double a,double b){
        return a / nod(a,b) * b;
    }
}
