package part2.homework3;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws myError{

        Integer [] num1 = new Integer[5];
        Double [] num2 = new Double[6];

        for (int i=0;i<num1.length;i++){
            num1[i] = i;
        }
        int j;
        double i;
        for (i=0.5,j=0;i<num2.length;i++,j++){
            num2[j] = i;
        }
        MathBox<Integer> mathBox1;
        MathBox<Double> mathBox2;

        mathBox1= new MathBox<Integer>(num1);
        mathBox2= new MathBox<Double>(num2);

        Map<Integer,ObjectBox> map = new HashMap<>();
        map.put(map.hashCode(),mathBox1);
        map.put(map.hashCode(),mathBox2);

        for(Map.Entry<Integer, ObjectBox> counter : map.entrySet()){
            MathBox Temp = (MathBox)counter.getValue();
            System.out.println("Numbers: "+Temp.toString());
            System.out.println("Сумма: "+Temp.summmator());
            Temp.splitter(2.0);
            System.out.println("Numbers:"+Temp.toString());
            Temp.Delete(0.0);
            System.out.println("Numbers: "+Temp.toString());
        }


    }
}
