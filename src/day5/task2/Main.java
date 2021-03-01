package day5.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type Main
 */
public class Main {

    public static void main(String[] args) {
        List<int[]> listPas = new ArrayList<>();
        listPas.add(new int[]{3,2});
        listPas.add(new int[]{5,3});
        listPas.add(new int[]{3,1});
        listPas.add(new int[]{0,1});
        listPas.add(new int[]{3,1});

        int n = listPas.stream()
            .mapToInt(s -> s[0]-s[1]).sum();
        System.out.println(n);
    }
}
