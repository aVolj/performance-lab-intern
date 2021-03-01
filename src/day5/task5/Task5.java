package day5.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * todo Document type Task5
 */
public class Task5 {
    public static void main(String[] args) {
        //5.0
        String s = "Тестовая строка используемая для разложения на слова";
        List<String> splitString= splitString(s);
        System.out.println(splitString);

        //с помощью методов String
        String[] arrString = s.split(" ");
        System.out.println(Arrays.toString(arrString));

    }

    public static List<String> splitString(String str){
        List<String> arrayStr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            arrayStr.add(st.nextToken());
        }
        return arrayStr;
    }
}
