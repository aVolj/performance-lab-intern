import java.util.Arrays;

public class task1_5 {
    static void printSortEl(int n) {

        int arrayInt[] = new int[n];
        String even="", odd = "", div3 = "";
        for(int i = 0; i < n; i++){
            arrayInt[i] = (int) (1 + Math.random()*100);
        }
        for(int i: arrayInt){
            if (i % 2 == 0) {
                even += (i + " ");
            } else {
                odd += (i + " ");
            }

            if (i % 3 == 0) {
                div3 += (i + " ");
            }
        }
        System.out.println(even + "\n" + odd +"\n" + div3 + "\n");
    }
}
