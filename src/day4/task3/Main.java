package day4.task3;

/**
 * todo Document type Main
 */
public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        Test1 test = new Test1();
        util.benchmark(test.callable1, 100000);
        util.benchmark(test.callable2, 100000);
        util.benchmark(test.callable3, 1000);
        util.benchmark(test.callable4, 100000);
        util.benchmark(test.callable5, 1000);

        util.benchmark(test.callable1_2, 100000);
        util.benchmark(test.callable2_2, 100000);
        util.benchmark(test.callable3_2, 1000);
        util.benchmark(test.callable4_2, 100000);
        util.benchmark(test.callable5_2, 1000);
    }
}
