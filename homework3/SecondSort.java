package part1.homework3;
import java.util.Arrays;

public class SecondSort implements Sort {
    public SecondSort() {
        this.algNameText = "Сортировка ыторым методом";
    }

    private String algNameText;
    private long startTime;
    private long endTime;

    @Override
    public void Sort(Person[] persons) {
        startTime = System.currentTimeMillis();
        Arrays.sort(persons);
        endTime = System.currentTimeMillis();
        printSortTime("Мужчины|Возраст|Алфавит");
    }

    private void printSortTime(String algText){
        long duration = endTime-startTime;
        System.out.println(algNameText+" заняла "+duration+" сек");
    }
}