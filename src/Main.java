import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //чтение в буфер введенного значения
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        //регулярка на проверку, число или нет
        String reg = "^[a-zA-Z]+[\\W_+]?$";

        System.out.println("What's up! О чем my friend думаешь?");
        String answer = buffer.readLine();
        String[] answerArray = answer.split(" ");

        int count = 0;
        for(int i = 0; i < answerArray.length; i++){
            if(answerArray[i].matches(reg)){
                count++;
                System.out.println(answerArray[i]);
            }
        }

        System.out.println("В ответе английских слов: " + count);


    }
}