public class Arrays {
    public static void main(String[] args) {
       int number = 10;            // [10]
       int[] numbers = new int[5];      // number -> [массив] Ccылочный тип данных
        for(int i = 0; i<numbers.length;i++){
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        int[] numbers1 = {1,2,3};      //  заранее знем какие элементы мы хотим поместить в массив
        for(int i = 0;i<numbers.length;i++){
            System.out.println(numbers1[i]);
        }
    }
}
