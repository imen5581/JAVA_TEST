package PalindromeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Оператор on 14.09.2019.
 */
public class Main{
    static  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        run();
    }

    public static int pole(int num){
        int reverse=0;
        int n = num;


        for (int i=0; i<=num; i++){

            int r=num%10;
            num=num/10;
            reverse=reverse*10+r;
            i=0;

        }

        if(n == reverse) {
            return n;
        }

        return -1;
    }

    public static void run() throws IOException {
        System.out.println("Введите цифру: ");
        int num = Integer.parseInt(reader.readLine());
        for (int i=0; i < num; i++) {
            if (pole(i)!=-1)
                System.out.println(pole(i));
        }
    }
}