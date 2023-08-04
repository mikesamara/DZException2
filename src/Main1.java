

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float fNum = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", fNum);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Вы ввели не дробное число");
            }

        }
    }
}