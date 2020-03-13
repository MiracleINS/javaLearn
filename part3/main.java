package part3;

public class main {
    public static void main(String[] args) {
        Person master1=new Person("Ильназ",21,"МУЖЧИНА");
        Person master2 =new Person("Андрей",21,"МУЖЧИНА");
        Person master3 =new Person("Алина",20,"ДЕВОЧКА");
        Person master4 =new Person("Айгуль",30,"ДЕВОЧКА");

        Animal pet1=new Animal(1,"Барсик",master1,10);
        Animal pet2=new Animal(2,"Рексик",master3,20);
        Animal pet3=new Animal(3,"Пупсик",master2,30);
        Animal pet4=new Animal(4,"Кошара",master2,20);
        Animal pet5=new Animal(5,"Мурка",master4,24);
        Animal pet6=new Animal(3,"Пупсик",master2,25);
        Animal pet7=new Animal(3,"Пупсик",master4,26);
        Animal pet8=new Animal(3,"Пупсик",master1,31);

        AnimalCard index = new AnimalCard();
        try {
            index.addAnimal(pet1);
            index.addAnimal(pet2);
            index.addAnimal(pet3);
            index.addAnimal(pet4);
            index.addAnimal(pet5);
            index.addAnimal(pet6);
            index.addAnimal(pet7);
            index.addAnimal(pet8);
        }
        catch (ExceptionInInitializerError e){
            e.printStackTrace();
        }

        index.printUnsorted();
        System.out.println("Поиск по кличке: ");
        Animal findPet = index.findAnimal("Кошара");
        if(findPet!=null) {
            System.out.println("Кот " + findPet.getName() + " найден "+ findPet.toString());
        }
        System.out.println("Изменение хозяина: ");
        index.EditAnimalPersonById(3,master1);
        index.printUnsorted();
        System.out.println("Изменение имени: ");
        index.EditAnimalNameById(3,"Пушок");
        index.printUnsorted();
        System.out.println("Сортир: ");
        index.printSorted();
    }
}
