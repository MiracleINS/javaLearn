package part4.homework;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class pFactorial implements Callable<BigInteger> {
    private Integer number1;
    private Integer number2;

    public pFactorial(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    private BigInteger CalcMultiplication() {
        BigInteger result = BigInteger.valueOf(this.number1);
        for (int i = this.number1 + 1; i <= this.number2; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    @Override
    synchronized public BigInteger call() throws Exception {
        return CalcMultiplication();
    }
}