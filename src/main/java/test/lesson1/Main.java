package test.lesson1;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        List<Integer> list = new ArrayList<>(Arrays.asList(56,34,76,33,65,32,3));
        bubbleSorter.sort(list);


        Person person1 = new Person("Alex", 25, Profession.DEVELOPER, true);

        Person person2 = new Person("Lexa", 28, Profession.DOCTOR, false);

        Person person3 = new Person("Lena", 30, Profession.QA, false);

        Person person4 = new Person("Абдула", 20);

        person4.setProfession(Profession.QA);

        Person person5 = new Person(19, "Sveta");

        person5.setProfession(Profession.DEVELOPER);

        List<Person> persons1 = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        List<Person> persons2 = new ArrayList<>();
        persons2.add(person1);
        persons2.add(person2);
        persons2.add(person3);
        persons2.add(person4);
        persons2.add(person5);

// for (Person person : persons1){
// System.out.println(" Имя человека " + person.getName() + " возрост " + person.getAge());
// }
// for( int i = 0; i < persons1.size(); i++){
// System.out.println(persons1.get(i));
// }
// int ageOfAllPersons = 0;
//
// for( int i = 0; i < persons1.size(); i++) {
// ageOfAllPersons = persons1.get(i).getAge();
// }
//
// double averageAge = (double) ageOfAllPersons / 5d;
// System.out.println(averageAge);

// int ageOfOldestPerson = 0;
//
// for (int i = 0; i < persons1.size(); i++) {
// if (persons1.get(i).getAge() > ageOfOldestPerson) {
// ageOfOldestPerson = persons1.get(i).getAge();
// }
// }
// System.out.println(ageOfOldestPerson);

//        int ageOfOldestPerson = 0;
//
//        for (int i = 0; i < persons1.size(); i++) {
//            if (persons1.get(i).getAge() < ageOfOldestPerson || ageOfOldestPerson == 0) {
//                ageOfOldestPerson = persons1.get(i).getAge();
//            }
//        }

//        System.out.println(ageOfOldestPerson);

//        List<String> list = new ArrayList<String>();
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(19);
//        numbers.add(32);
//        numbers.add(44);
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(2));
//        for (Person person : persons1) {
//            if (person.getProfession() == Profession.DEVELOPER)
//            if (person.getProfession().equals(Profession.DEVELOPER) || person.getProfession().equals(Profession.QA) ){
//
//                System.out.println(" Профессия человека " + person.getName() + " - " + person.getProfession());
//            }else if (person.getProfession().equals(Profession.QA)){
//                    System.out.println(" Профессия человека " + person.getName() + " - " + person.getProfession());
//            }else {
//            System.out.println(" Профессия человека " + person.getName() + " не DEVELOPER и не QA");}
//
//        }

        System.out.println(factorial(10));
    }
    public static int factorial(int number){
        int result = 1;
        for(int i = 1; i <= number;i++){
           result = result * i;
        }
        return result;

    }
}