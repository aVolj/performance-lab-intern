package day6.task5_0_4;

/**
 * todo Document type Baggage
 */
public class Baggage {
    private String nameCarrier;
    private String classFlightName;
    private double maxWeight;


    public Baggage(String nameCarrier, ClassFlight classFlightName, double maxWeight) {
        this.nameCarrier = nameCarrier;
        this.classFlightName = classFlightName.name;
        this.maxWeight = maxWeight;
    }

    public String getNameCarrier() {
        return nameCarrier;
    }

    public void setNameCarrier(String nameCarrier) {
        this.nameCarrier = nameCarrier;
    }

    public String getClassFlightName() {
        return classFlightName;
    }

    public void setClassFlightName(String classFlightName) {
        this.classFlightName = classFlightName;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "nameCarrier='" + nameCarrier + '\'' +
            ", classFlightName='" + classFlightName + '\'' +
            ", maxWeight=" + maxWeight +
            '\n';
    }
}
