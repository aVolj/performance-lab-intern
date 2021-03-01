package day5.task5;

/**
 * todo Document type Task5_1
 */
public class Task5_1 {
    public static void main(String[] args) {
        String s = "Тестовая строка используемая для разложения на слова";
        String s1 = addSpace(s);
        System.out.println(reverseStringAndDeleteSpace(s1));

    }
    public static String addSpace(String s) {
        return " " + s + " ";

    }
    public static String reverseStringAndDeleteSpace(String s){
            return new StringBuilder(s).reverse().toString().trim();
        }
    }
