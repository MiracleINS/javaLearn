package part3;

public class Animal implements Comparable {
    private int id;
    private String name;
    private Person person;
    private int ves;

    public Animal(int id, String name, Person person,int ves) {
        this.id = id;
        this.name = name;
        this.person = person;
        this.ves = ves;
    }

    public int getId() {
        return id;
    }
    public Person getMaster() {
        return person;
    }
    public String getName() {
        return name;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public int getWeight() {
        return ves;
    }

    @Override
    public String toString() {
        return "Животные[" +
                "id = " + id +
                ", имя = '" + name + '\'' +
                ", хозяин = " + person +
                ", вес = " + ves +
                ']';
    }

    @Override
    public int compareTo(Object key) {
        Animal pet = (Animal)key;
        int res = 0;
        int resPerson = this.getMaster().compareTo(pet.getMaster());
        int resVes = this.getWeight() - pet.getWeight();
        int resName = this.getName().compareTo(pet.getName());

        if(resPerson==0) {
            if (resName == 0) {
                res = resVes;
            }
            else
                res = resName;
        }
        else{
            res=resPerson;
        }
        return res;
    }
}
