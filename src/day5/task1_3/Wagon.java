package day5.task1_3;

/**
 * todo Document type Wagon
 */
public class Wagon implements Comparable{
    private int id;
    private int weight;
    private TypeWagon typeWagon;

    public Wagon(int weight, TypeWagon typeWagon) {
        this.id = (int) (Math.random()*100+1);
        this.weight = weight;
        this.typeWagon = typeWagon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public TypeWagon getTypeWagon() {
        return typeWagon;
    }

    public void setTypeWagon(TypeWagon typeWagon) {
        this.typeWagon = typeWagon;
    }

    @Override
    public String toString() {
        return "Wagon № = " +
                id +
            ", weight=" + weight +
            ", typeWagon=" + typeWagon +
            "\n";
    }

    @Override
    public int compareTo(Object o) {
        if(this.getWeight() < ((Wagon) o).getWeight()){
            return 1;
        }else if(this.getWeight() > ((Wagon) o).getWeight()){
            return -1;
        }else{
            return 0;
        }
    }
}
