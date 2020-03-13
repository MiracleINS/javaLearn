package part2.homework3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ObjectBox <T> {

    public Set<T> massiv = new HashSet<>();

    public ObjectBox() {
    }

    public void addObject(T obj){
        massiv.add(obj);
    }

    public void deleteObject(T obj){
        if(massiv.contains(obj)) {
            massiv.remove(obj);
        }
    }

    public Set<T> getCollection() {
        return massiv;
    }

    @Override
    public int hashCode() {
        //return collection.hashCode();
        String str="";
        for (T obj:massiv) {
            str = obj.hashCode() + str;
        }
        return str.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        ObjectBox box2 = (ObjectBox) obj;
        Set<T> collection2 = box2.getCollection();
        Iterator<T> iterator1=massiv.iterator();
        Iterator<T> iterator2=box2.getCollection().iterator();
        boolean result = true;
        if(massiv.size()==collection2.size()){
            while(iterator1.hasNext()){
                T one =iterator1.next();
                T two =iterator2.next();
                if(!one.equals(two)){
                    result =false;
                    break;
                }
            }
        }
        else
            result=false;

        return result;
    }

    @Override
    public String toString() {
        Iterator <T> it = massiv.iterator();
        String result="";
        while(it.hasNext())
            result = it.next().toString()+" | "+result;
        return result;
    }

    public void Delete(T num){
        if(massiv.contains(num)){
            massiv.remove(num);
        }
    }
}
