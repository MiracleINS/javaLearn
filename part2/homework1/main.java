package part2.homework1;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        //2 различных массива Numbers
        Number [] num1 = new Number[5];
        for (int i=0;i<num1.length;i++){
            num1[i] = i;
        }
        Number [] num2 = new Number[10];
        for (int i=0;i<num2.length;i++){
            num2[i] = i;
        }

        MathBox mathBox1 = new MathBox(num1);
        MathBox mathBox2 = new MathBox(num2);
        MathBox mathBox3= new MathBox(num1);

        Map<Integer,MathBox> m = new HashMap<>();
        m.put(mathBox1.hashCode(),mathBox1);
        m.put(mathBox2.hashCode(),mathBox2);
        m.put(mathBox2.hashCode(),mathBox3);

        System.out.println("Размер:"+m.size());

        for(Map.Entry<Integer, MathBox> counter : m.entrySet()){
            System.out.println("Numbers: "+counter.getValue().toString());
            System.out.println("Сумма: "+counter.getValue().summmator());
            counter.getValue().splitter(2.0);
            System.out.println("Numbers: "+counter.getValue().toString());
            counter.getValue().Delete(0.0);
            System.out.println("Numbers: "+counter.getValue().toString());
        }
    }
}