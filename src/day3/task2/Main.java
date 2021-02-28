package day3.task2;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * todo Document type Main
 */
public class Main {
    public static void main(String[] args) {
        //2.1
        String[] colorArray = {"Red", "Orange", "Yellow", "Green",
        "Blue", "Purple", "Pink"};
        //2.2
        List<String> listColor = new ArrayList<>(Arrays.asList(colorArray));
        //2.3
        Iterator iterator = listColor.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //2.4
        System.out.println("==========================================\n2.4");
        Collections.sort(listColor);
        System.out.println(listColor);

        //2.5
        listColor.set(1, "Dark "+ listColor.get(1));
        listColor.set(3, "Dark "+ listColor.get(3));
        listColor.set(5, "Dark "+ listColor.get(5));

        System.out.println("==========================================\n2.5");
        for(String element: listColor){
            System.out.println(element);
        }

        //2.6
        System.out.println("==========================================\n2.6");
        System.out.println(listColor.subList(0,5));

        //2.7
        System.out.println("==========================================\n2.7");
        System.out.println(swap1to4(listColor));

        //2.8
        System.out.println("==========================================\n2.8");
        String a1 = listColor.get(3);

        //2.9
        System.out.println(listColor.contains(a1));

        //2.10
        System.out.println("==========================================\n2.10");
        for (int i = 0; i < listColor.size(); i++) {
            if (listColor.get(i).matches(".*[oO].*")) {
                listColor.remove(i);
            }
        }
        System.out.println(listColor);

        //2.11
        System.out.println("==========================================\n2.11");
        String[] newArr = listColor.toArray(new String[0]);
        System.out.println(Arrays.toString(newArr));
    }
    public static List<?> swap1to4(List<?> list){
        if(list.size() > 4) {
            Collections.swap(list, 0, 3);
        }
        return list;
    }
}
