package hashmappachet;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args){
        HashMap<String, Integer> note = new HashMap<>();
        note.put("Popescu", 4);
        note.put("Ionescu", 10);
        note.put("Vasilescu", 9);
        note.put("Andreescu", 6);

        System.out.println(note.get("Popescu"));
        note.put("Popescu", 7);
        System.out.println(note.get("Popescu"));

        note.remove("Vasilescu");
        System.out.println(note.containsKey("Vasilescu"));

        System.out.println(note.size());

        for(HashMap.Entry<String, Integer> hm : note.entrySet()){
            System.out.println(hm.getKey() + ": " + hm.getValue());
        }

        for(String key : note.keySet()){
            System.out.println(key);
        }
        for (Integer value : note.values()){
            System.out.println(value);
        }

    }
}
