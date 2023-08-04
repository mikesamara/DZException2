import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Main4 {
   public static void main(String[] args) {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Введите любую строку");
       try {
           String res = bufferedReader.readLine();
           if (res.equals("")) throw new RuntimeException("Нельзя вводить пустую строку");
           System.out.println(res);
       } catch  (IOException e) {
           throw new RuntimeException(e);
       }
   }
}
