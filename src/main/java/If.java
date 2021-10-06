import java.util.ArrayList;
import java.util.List;

public class If {
    public static void main(String[] args){
        String  num = "5";
        int i = 45678;

        Cat cat = new Cat(5,"Kira");
        String name = cat.getName();

        Cat cat2 = new Cat(3, name);
        System.out.println(cat);
        cat2.setName("Vasya");
        System.out.println(cat2);

//        int chislo = Integer.
//        System.out.println(Integer.toBinaryString(i));
//        long j =  Long.parseLong(Integer.toBinaryString(i));
//        System.out.println(j);
//        int myInt = 5;
//        if(myInt<10){
//            System.out.println("Да верно."); //если блог if выполняется не верно , то переходит на следующий блог else
//        }else if(myInt>20){
//            System.out.println("Нет не верно");
//        }else{
//            System.out.println("Не один из предыдущих случаев");
//        }
//        List<Integer> result = fibanachi(10);
//        System.out.println(result);
    }
    public static List<Integer> fibanachi(int number){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for(int i = 2; i<number; i++){
            int current = result.get(i-1)+result.get(i-2);
            result.add(current);
        }
        return result;
    }

}
