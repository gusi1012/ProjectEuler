import java.util.ArrayList;
/**
 * Created by Admin on 10.08.2016.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Calc {

    public int evenFibonacci() {
        int a = 0;
        int b = 1;
        ArrayList<Integer> c = new ArrayList<>();

        while((a + b) < 4000000) {
            if((a + b) % 2 == 0 ) {
                c.add(a + b);
            }
            int zwischenergebnis = a;
            a = b;
            b = zwischenergebnis + b;
        }
        return c.stream().mapToInt(Integer::intValue).sum();
    }

}
