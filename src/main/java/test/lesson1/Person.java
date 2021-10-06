package test.lesson1;

public class Person {
    String name;
    int age;
    Profession profession;
    boolean isMarried;

    public Person(String name, int age, Profession profession, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.isMarried = isMarried;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
































































































































































































































































    }
    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "Age='" + age + "'" +
                ", name=" + name +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public boolean getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }
}

