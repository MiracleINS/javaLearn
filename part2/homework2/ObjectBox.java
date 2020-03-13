package part2.homework2;

import java.util.HashSet;
import java.util.Set;

public class ObjectBox {

    public Set<Object> massiv = new HashSet<Object>();

    public ObjectBox() {
    }

    /**
     * Добавление в коллекцию
     */
    public void addObject(Object obj){
        massiv.add(obj);
    }

    /**
     * Удаление из коллекции
     */
    public void deleteObject(Object obj){
        if(massiv.contains(obj)) {
            massiv.remove(obj);
        }
    }
    /**
     * Печать
     */
    public void dump() {
        String str = "";
        for (Object obj : massiv) {
            str = obj.toString()+" | "+str;
        }
        str.replaceAll(""," | ");
        System.out.println(str);
    }
}
