package part2.homework1;
import java.util.*;

public class MathBox {
    private Set<Number> massiv = new HashSet<>();

    /**
     *  Первое условие: на вход полуает массив Number
     */
    public MathBox(Number [] number) {
        for (Number num:number) {
            massiv.add(num);
        }
    }

    /**
     *  Условие: Существует метод summator, возвращающий сумму всех элементов коллекции
     */
    public int summmator(){
        Iterator counter = massiv.iterator();
        Integer sum=0;
        while(counter.hasNext())
            sum=(Integer) counter.next()+sum;
        return sum;
    }

    /**
     * Третье условие: выполняющий поочередное деление всех хранящихся в объекте элементов на делитель,
     * являющийся аргументом метода. Хранящиеся в объекте данные полностью заменяются результатами делени
     */
    public void splitter(Double number){
        Set massiv2 = new HashSet<Double>();
        Iterator<Number> counter=massiv.iterator();
        while(counter.hasNext()) {
            Double d = counter.next().doubleValue() / number;
            massiv2.add(d);
            counter.remove();
        }
        massiv=massiv2;
    }

    /**
     * Метод, который получает на вход Number и если такое значение есть в коллекции, удаляет его.
     */
    public void Delete(Number number){
        if(massiv.contains(number)){
            massiv.remove(number);
        }
    }

    public Set<Number> getMassiv() {
        return massiv;
    }

    /**
     * Препеоделение hashcode.
     */
    @Override
    public int hashCode() {
        String stroka ="";
        for (Number num:massiv) {
            stroka = num.toString() + stroka;
        }
        return stroka.hashCode();
    }

    /**
     * Препеоделение equals
     */
    @Override
    public boolean equals(Object obj) {
        MathBox mathBox2 = (MathBox)obj;
        Set<Number> collection2 = mathBox2.getMassiv();
        Iterator<Number> iterator1=massiv.iterator();
        Iterator<Number> iterator2=mathBox2.getMassiv().iterator();
        boolean result = true;
        if(massiv.size()==collection2.size()){
            while(iterator1.hasNext()){
                Number one =iterator1.next();
                Number two =iterator2.next();
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

    /**
     * Переопределение toString. Вывод через "| "
     */
    @Override
    public String toString() {
        Iterator it = massiv.iterator();
        String result="";
        while(it.hasNext())
            result = it.next().toString()+" | "+result;
        return result;
    }
}
