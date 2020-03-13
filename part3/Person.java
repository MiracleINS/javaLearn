package part3;

/**
 * Класс Хозяин.
 */

public final class Person implements Comparable {
    private String name;
    private Integer age;
    private String sex;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Человек[" +
                "имя = '" + name + '\'' +
                ", возраст = " + age +
                ", пол = '" + sex + '\'' +
                ']';
    }

    public String getName() { return name;}
    public Integer getAge() { return age;}
    public String getSex()  { return sex;}

    /**
     * переопределение Compare для сорттировку домашних животных
     */
    @Override
    public int compareTo(Object key) {
        Person master=(Person) key;
        int res;
        res = this.getName().compareTo(master.getName());
        if (res==0){
            res = this.getAge()-master.getAge();
        }
        return res;
    }
}