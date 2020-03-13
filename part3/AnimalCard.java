package part3;

import java.util.*;

/**
 * Картотека домашних животных. 2 коллекции. TreeSet для сортировки, HashMap для хранения и поиска
 */


public class AnimalCard {
    private Set<Animal> set;
    private Map<String, Animal> m;

    public AnimalCard() {
        m = new HashMap<>();
        set = new TreeSet<>();
    }

    /**
     * Добавляется животное и в map для поиска и в set для сортировки
     * @param Animal добавляемое животное
     */
    public void addAnimal(Animal Animal) throws ExceptionInInitializerError{
        if(m.containsKey(Animal.getName())){
            throw new ExceptionInInitializerError("Кот "+Animal.getName()+" уже в коллекции");
        }
        set.add(Animal);
        m.put(Animal.getName(),Animal);
    }

    /**
     * Поиск животного по имени
     * @param AnimalName - имя животного
     * @return - Класс животное
     */
    public Animal findAnimal(String AnimalName){
        Animal Animal = null;
        if(m.containsKey(AnimalName))
            Animal = m.get(AnimalName);
        return Animal;
    }

    /**
     * Изменение хозяина животного по его идентификатору
     */
    public void EditAnimalPersonById(int AnimalId,Person person){
        Iterator <Animal> it = set.iterator();
        Animal AnimalNew;
        Animal AnimalOld;

        while(it.hasNext()) {
            AnimalOld=it.next();
            if (AnimalOld.getId()==AnimalId) {
                AnimalNew=new Animal(AnimalOld.getId(),AnimalOld.getName(),person,AnimalOld.getWeight());
                m.replace(AnimalOld.getName(),AnimalNew);
                set.add(AnimalNew);
                set.remove(AnimalOld);
                break;
            }
        }
    }

    /**
     * Меняем имя животного.
     */
    public void EditAnimalNameById(int AnimalId,String name){
        Iterator <Animal> it = set.iterator();
        Animal AnimalNew;
        Animal AnimalOld;
        while(it.hasNext()) {
            AnimalOld=it.next();
            if (AnimalOld.getId()==AnimalId) {
                AnimalNew=new Animal(AnimalOld.getId(),name,AnimalOld.getMaster(),AnimalOld.getWeight());
                m.remove(AnimalOld.getName(),AnimalOld);
                m.put(AnimalNew.getName(),AnimalNew);
                set.add(AnimalNew);
                set.remove(AnimalOld);
                break;
            }
        }
    }

    public void printUnsorted(){
        for (Map.Entry entry : m.entrySet()){
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }
    }

    /**
     * Печать отсортированной карточки
     */
    public void printSorted(){
        for(Animal animal:set)
            System.out.println(animal.toString());
    }


}