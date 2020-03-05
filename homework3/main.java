package part1.homework3;

import java.util.Random;
/**
 * @author Ильназ Шарафиев
 * */
public class main {
    private static Person[] personArray;

    public static void main(String[] args) {
        Sort bubble = new Bubble();
        Sort Second = new SecondSort();
        try {
            generatePersonArray();
        }
        catch  (Exception err){
            err.printStackTrace();
        }

        System.out.println("Исходный");
        printPersons();

        System.out.println("Сортировка Second способом");
        Second.Sort(personArray);
        printPersons();

        System.out.println("Сортировка bubble способом");
        bubble.Sort(personArray);
        printPersons();
    }

    /**
     * Функция заполнения массива
     */
    private static void generatePersonArray() {
        personArray = new Person[100];

        Random rnd = new Random();
        String[] firstnames = {"Ильназ", "Ильназ2", "Ильназ3", "Лейсан", "Лейсан2"};
        String[] lastnames = {"Sharafiev", "Sharafiev2", "Sharafiev3", "Sharafieva", "Sharafieva2"};
        String[] sexs = {"MAN", "WOMAN"};

        for (int i = 0; i < personArray.length; i++) {
            String name = firstnames[rnd.nextInt(firstnames.length-1)] + " " + lastnames[rnd.nextInt(firstnames.length-1)];
            String sex = sexs[rnd.nextInt(sexs.length)];
            Integer age = rnd.nextInt(5);
            Person person = new Person(age, sex, name);
            personArray[i] =person;
        }
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getName().compareTo(personArray[i].getName())==0)
                System.out.print("Совпадение firstname и lasname");
        }
    }

    private static void printPersons(){
        for (Person person:personArray) {
            System.out.println(person.getName() +
                    " пол: " + person.getSex() +
                    " возраст: " + person.getAge());
        }
    }
}