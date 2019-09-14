package EvenOrOdd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Оператор on 14.09.2019.
 */
public class evenOrodd {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        while (true) {
            Thread.sleep(3000);
            System.out.println("Введите число:");
            key = reader.readLine();
            if (key.isEmpty()){
                System.out.println("Ошибка ввода числа. Повторите!");
                continue;
            }
            if (key.equals("exit")) {
                System.out.println("До скорой встречи!");
                break;
            }
            double number = Double.valueOf(key);
            if (number%1 !=0){
                System.out.println("Число не является целым!");
                continue;
            }
            paritycheck(number);
            simpleorcompound(number);

        }

    }


    public static void paritycheck(double i){

                if (i%2 == 0){
                    System.out.println(i+" - Число четное");
                }
                else if (i%2 !=0){
                    System.out.println(i+" - Число нечетное");
                }
        }



    public static void simpleorcompound(double num){
        double temp;
        boolean isPrime=true;
        for (int i=2; i<=num/2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        // если переменная isPrime равна true, то число простое
        if(isPrime) {
            System.out.println(num + " - Число простое");
        } else {
            System.out.println(num + " - Число составное");
        }
    }
    }

