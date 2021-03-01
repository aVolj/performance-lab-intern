package day5.task1_3;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type Main
 */
public class Main {
    public static void main(String[] args) {
        List<Wagon> wagonList = new ArrayList<>();
        wagonList.add(new Wagon(200, TypeWagon.WAGON));
        wagonList.add(new Wagon(150, TypeWagon.SEMIWAGON));
        wagonList.add(new Wagon(200, TypeWagon.HOPPER));
        wagonList.add(new Wagon(400, TypeWagon.LOCOMOTIVE));
        wagonList.add(new Wagon(214, TypeWagon.PLATFORM));
        wagonList.add(new Wagon(305, TypeWagon.REFRIGERATOR));
        wagonList.add(new Wagon(600, TypeWagon.TANK));

        wagonList.stream().forEach(System.out::println);
        System.out.println("===============================");
        wagonList.stream().sorted(Wagon::compareTo)
            .forEach(s -> System.out.println("№ " + s.getId() + " тип вагона: " + s.getTypeWagon()));
    }
}
