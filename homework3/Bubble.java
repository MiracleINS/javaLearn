package part1.homework3;

import java.util.ArrayList;

/**
 * Сортировка методом пузырька.
 */


class Bubble implements Sort {

    private Person [] persons;
    private long startTime;
    private long endTime;
    private String NameText;

    public Bubble() {
        this.NameText = "Сортировка методом пузырька";
    }

    private void toSwap(int first, int second){
        Person dummy = persons[first];
        persons[first] = persons[second];
        persons[second] = dummy;
    }

    @Override
    public void Sort(Person[] persons) {
        this.persons = persons;
        startTime = System.currentTimeMillis();
        for (int out = this.persons.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(this.persons[in].getSex()==this.persons[in+1].getSex()) {
                    if (this.persons[in].getAge() < this.persons[in + 1].getAge())
                        toSwap(in, in + 1);
                    if (this.persons[in].getAge() == this.persons[in + 1].getAge()) {
                        int result = this.persons[in].getName().compareTo(this.persons[in + 1].getName());
                        if (result > 0)
                            toSwap(in, in + 1);
                    }
                }
                else{
                    if(this.persons[in].getSex().compareTo("MAN")!=0){
                        toSwap(in, in + 1);
                    }
                }
            }
        }
        endTime = System.currentTimeMillis();
        printSortTime("ПОлная сортировки");
    }

    private void printSortTime(String algText){
        long dur = endTime-startTime;
        System.out.println(NameText+" заняла "+dur+"сек");
    }
}