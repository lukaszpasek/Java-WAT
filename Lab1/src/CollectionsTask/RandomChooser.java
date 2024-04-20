

package CollectionsTask;

import java.util.*;

public class RandomChooser {


    public static void main(String[] args) {
        Names names = new Names(new String[]{"Bob", "John", "Stefan"});

        System.out.println("Lista przed wyborem");
        for (String name: names.get_names()) {
            System.out.println("    " + name);
        }
        System.out.println();
        String choosenName = names.choose();

        System.out.println("Wybrany: " + choosenName);
        System.out.println();

        System.out.println("Lista po wyborze");
        for (String name: names.get_names()) {
            System.out.println("    " + name);
        }
        System.out.println();




    }

}
