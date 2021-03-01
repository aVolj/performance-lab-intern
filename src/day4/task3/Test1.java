package day4.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * todo Document type Test
 */
public class Test1 {

    List<String> stringLinkedList = new LinkedList<>(asList("a", "b", "c", "d"));
    List<String> stringArrayListList = new ArrayList<>(asList("a", "b", "c", "d"));

    public Callable callable1 = () -> stringLinkedList.add("el"); //быстро для обоих
    public Callable callable2 = () -> stringLinkedList.add(5, "el"); //быстро для LinkedList, долго для ArrayList
    public Callable callable3 = () -> stringLinkedList.get(90000); //быстро для ArrayList, долго для LinkedList
    public Callable callable4 = () -> stringLinkedList.remove(2); //быстро для LinkedList, долго для ArrayList
    public Callable callable5 = () -> stringLinkedList.set(90000, "el");//быстро для ArrayList, долго для LinkedList

    public Callable callable1_2 = () -> stringArrayListList.add("el"); //быстро для обоих
    public Callable callable2_2 = () -> stringArrayListList.add(5, "el"); //быстро для LinkedList, долго для ArrayList
    public Callable callable3_2 = () -> stringArrayListList.get(90000); //быстро для ArrayList, долго для LinkedList
    public Callable callable4_2 = () -> stringArrayListList.remove(2); //быстро для LinkedList, долго для ArrayList
    public Callable callable5_2 = () -> stringArrayListList.set(90000, "el");//быстро для ArrayList, долго для LinkedList

    public Test1() {
        for (int i = 0; i < 110000; i++) {
            stringArrayListList.add("String" +i);
            stringLinkedList.add("String" + i);
        }
    }
}
