public class ClassesAndObjects {
    public static void main(String[] args){
   Person person1 = new Person();
   person1.name = "Roma";
   person1.age = 50;
   person1.sayHello();
  // System.out.println("Меня зовут"+person1.name +","+person1.age+"лет");
   Person person2 = new Person();
   person2.name = "sasha";
   person2.age = 20;
   person2.speak();
  // System.out.println("Меня зовут"+person2.name +","+person2.age+"лет");
    }
}
class Person{
    String name;
    int age;

    // у ласса может быть:
    //1. Данные (поля)
    //2. Действие , которые он может совершать( методы )
    void speak(){
        for (int i = 0; i<3; i++)
        System.out.println("Меня зовут"+name + ",мне " +age+" лет");

}
    void sayHello(){
      System.out.println("Привет");
}
}