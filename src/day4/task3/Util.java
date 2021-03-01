package day4.task3;

/**
 * todo Document type Util
 */
public class Util {
    Test1 test1 = new Test1();
    public void benchmark(Callable clb, int count){
        long a = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            clb.call();
        }
        long b = System.currentTimeMillis();
        System.out.println(b-a);
    }
}
