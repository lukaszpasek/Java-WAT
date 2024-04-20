package CollectionsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Names {
    List<String> _names;

    public Names(String[] names){
        _names = new ArrayList<String>(Arrays.asList(names));
    }

    public String[] get_names(){
        return _names.toArray(new String[_names.size()]);
    }

    public String choose(){
        Random random = new Random();
        int chosenIndex = random.nextInt(_names.size());

        String choosenName = _names.get(chosenIndex);
        _names.remove(chosenIndex);

        return choosenName;
    }
}
