package part2.homework3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MathBox<T extends Number> extends ObjectBox {

    public MathBox (T [] number) throws myError {
        //if (number.getClass() != Object.class)
            //throw new myError("Object в MathBox" + number.getClass());
        for (T num:number)
            massiv.add(num);
    }

    public Double summmator(){
        Iterator<T> it = massiv.iterator();
        Double sum=0.0;
        while(it.hasNext()) {
            T value = (T) it.next();
            sum = value.doubleValue() + sum;
        }
        return sum;
    }

    public void splitter(T num){
        Set massiv2 = new HashSet<T>();
        Iterator<T> iterator=massiv.iterator();
        while(iterator.hasNext()) {
            T value = iterator.next();
            Double d = value.doubleValue() / num.doubleValue();
            massiv2.add(d);
            iterator.remove();
        }
        massiv=massiv2;
    }
}
