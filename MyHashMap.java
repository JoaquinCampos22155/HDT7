import java.util.HashMap;

public class MyHashMap {
    private final HashMap<Integer, String[]> map;

    public MyHashMap() {
        map = new HashMap<>();
        map.put(1, new String[]{"house", "casa", "loger"});
        map.put(2, new String[]{"dog", "perro", "chien"});
        map.put(3, new String[]{"homework", "tarea", "devoirs"});
        map.put(4, new String[]{"woman", "mujer", "femme"});
        map.put(5, new String[]{"town", "pueblo", "ville"});
        map.put(6, new String[]{"yes", "si", "Oui"});
    }

    public String[] getValue(int key) {
        return map.get(key);
    }

    public int getSize() {
        return 0;
    }
}
