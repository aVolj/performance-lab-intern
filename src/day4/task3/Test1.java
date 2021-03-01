package day4.task3;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * todo Document type Test
 */
public class Test1 {

    List<String> stringList = new LinkedList<>(asList("a", "b", "c", "d"));

    //public Callable callable = () -> stringList.get(90000); //быстро для ArrayList, долго для LinkedList
    //public Callable callable = () -> stringList.add(5, "el"); //быстро для LinkedList, долго для ArrayList
    //public Callable callable = () -> stringList.add("el"); //быстро для обоих
    //public Callable callable = () -> stringList.remove(2); //быстро для LinkedList, долго для ArrayList
    public Callable callable = () -> stringList.set(90000, "el");//быстро для ArrayList, очень долго для LinkedList

    public Test1() {
        for (int i = 0; i < 110000; i++) {

            stringList.add("String" + i);
        }
    }
}
