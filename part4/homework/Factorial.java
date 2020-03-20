package part4.homework;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Вычисление факториала числа
 * collection - коллекция куда складывается вычисленный факториал для ускорения дальнейших вычислений
 */

public class Factorial implements Runnable {
    private static Map<Integer, BigInteger> collection = new ConcurrentHashMap<>();
    private Integer num;

    public Factorial(Integer number) {
        this.num = number;
    }

    /**
     * Вычисления факториала с использованием кеша
     */
    public BigInteger Factorial() {
        BigInteger res = null;
        if (!collection.isEmpty())
            res = getResultFromCashe();
        if (res == null) {
            res = BigInteger.ONE;
            for (int i = 1; i <= this.num; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
        }
        collection.put(this.num, res);
        return res;
    }

    private BigInteger getResultFromCashe() {
        return collection.get(this.num);
    }

    @Override
    public void run() {
        BigInteger temp = Factorial();
        System.out.println("F(" + num + ") = " + temp);
    }
}