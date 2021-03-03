package day6.task5_0_4;

/**
 * todo Document type ClassFlight
 */
public enum ClassFlight {
    A("Первый класс"),
    B("Бизнес класс"),
    C("Эконом класс");

    String name;

    ClassFlight(String name) {
        this.name = name;
    }
}
