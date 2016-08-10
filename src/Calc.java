import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 10.08.2016.
 */
public class Calc {

    public int multipleBelowTen(int a, int b) {
        ArrayList<Integer> zaehler = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            if((a * i) < 1000) {
                zaehler.add(a*i);
            }

            if((b * i) < 1000) {
                zaehler.add(b*i);
            }
        }
        //Collections enthält keine Duplicate
        Set<Integer> deleteDuplicateValue = new HashSet<>();
        deleteDuplicateValue.addAll(zaehler);
        //ArrayList des Zaehlers ist nun leer und Ergebnisliste ohne duplikate wird
        //hinzugefügt
        zaehler.clear();
        zaehler.addAll(deleteDuplicateValue);

        return zaehler.stream().mapToInt(Integer::intValue).sum();
    }

}
