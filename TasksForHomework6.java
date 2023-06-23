import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TasksForHomework6 {

    public static void main(String[] args) {
        MySet<Integer> ms = new MySet<>();
        System.out.println(ms.add(9));
        System.out.println(ms.add(9));
        System.out.println(ms.add(32));
        System.out.printf("size = %d\n", ms.size());
        System.out.println(ms.remove(9));
        System.out.println(ms.remove(9));
        System.out.println(ms.add(17));
        System.out.println(ms.add(6));
        System.out.println(ms.add(10));
        System.out.printf("size = %d\n", ms.size());

        Iterator<Integer> iter = ms.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(ms.tostring());
        System.out.println(ms.getbyindex(2));
    }
}

class MySet<E> {
    private HashMap<E, Object> mp = new HashMap<>();

    private static final Object OBJ = new Object();

    public boolean add(E num) {
        return mp.put(num, OBJ) == null;
    }

    public boolean remove(E num) {
        return mp.remove(num) != null;
    }

    public int size() {
        return mp.size();
    }

    public Iterator<E> iterator() {
        return mp.keySet().iterator();
    }

    public String tostring() {
        return mp.keySet().toString()
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
    }

    public Object getbyindex(int num) {
        ArrayList<Object> keys = new ArrayList<>();
        for (var item : mp.entrySet()) {
            keys.add(item.getKey());
        }
        return keys.get(num);
    }
}