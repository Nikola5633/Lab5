package ex3;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List colectiePerechi = new ArrayList<>();

        PerecheNumere p1 = new PerecheNumere(5,2);
        PerecheNumere p2 = new PerecheNumere(3,1);
        PerecheNumere p3 = new PerecheNumere(7,3);

        colectiePerechi.add(p1);
        colectiePerechi.add(p2);
        colectiePerechi.add(p3);

        for (Object p : colectiePerechi) {
            System.out.println(p.toString());
        }
    }
}
