package day6.task5_0_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * todo Document type BaggageTest
 */
public class BaggageTest {
    public static void main(String[] args) {
        List<Baggage> baggageList = new ArrayList<>();
        baggageList.add(new Baggage("Победа", ClassFlight.C, 23));
        baggageList.add(new Baggage("Аэрофлот", ClassFlight.B, 17));
        baggageList.add(new Baggage("S7", ClassFlight.A, 20));
        baggageList.add(new Baggage("Якутия", ClassFlight.B, 13));
        baggageList.add(new Baggage("Азимут", ClassFlight.C, 55));

        Comparator comparatorBaggage = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Baggage && o2 instanceof Baggage) {
                    if (((Baggage) o1).getMaxWeight() > ((Baggage) o2).getMaxWeight()) {
                        return 1;
                    } else if (((Baggage) o1).getMaxWeight() < ((Baggage) o2).getMaxWeight()) {
                        return -1;
                    } else {
                        return 0;
                    }
                } else {
                    throw new ClassCastException("Объекты не относятся к классу Baggage");
                }
            }
        };

        baggageList.sort(comparatorBaggage);
        System.out.println(baggageList);

        Comparator comparatorBaggageLambda = (o1, o2) -> {
            if (o1 instanceof Baggage && o2 instanceof Baggage) {
                return Integer.compare(lengthNameAndClassBaggage((Baggage) o1), lengthNameAndClassBaggage((Baggage) o2));
            } else {
                throw new ClassCastException("Объекты не относятся к классу Baggage");
            }
        };

        baggageList.sort(comparatorBaggageLambda.reversed());
        System.out.println(baggageList);
    }

    public static int lengthNameAndClassBaggage(Baggage o1){
        return o1.getNameCarrier().length() + o1.getClassFlightName().length();
    }
}
