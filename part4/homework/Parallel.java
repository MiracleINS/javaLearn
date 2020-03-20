package part4.homework;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 * Паралельная обработка массива чисел в несколько потоков.
 * massive - массив элементов для вычисления
 * parallelpotok - степень паралелизма с которой выполняются потоки. 3 - по умолчанию
 */

public class Parallel {
    private List<Integer> massive;
    private int parallelpotok;

    public Parallel(List<Integer> array) {
        this.massive = array;
        this.parallelpotok = 3;
    }

    /**
     * Вычисление факториала в несколько потоков.
     * Нечколько чисел вычисляются паралельно
     */
    public void ParallelMethod() {
        Iterator i = massive.iterator();
        ExecutorService service = Executors.newFixedThreadPool(parallelpotok);
        //Цикл по коллекции пока есть элементы
        while (i.hasNext()) {
            Integer value = (Integer) i.next();
            service.submit(new Factorial(value));
        }
        service.shutdown();
    }
}