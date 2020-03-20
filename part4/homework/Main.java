package part4.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Вычисления факториалов всех элементов массива. Использовать пул потоков для решения задачи.
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> massive = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            int num = i;
            massive.add(num);
        }

        Parallel p = new Parallel(massive);
        p.ParallelMethod();
        massive.forEach(System.out::println);
    }


}
