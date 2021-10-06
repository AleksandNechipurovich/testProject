package test.lesson1;


import java.util.Arrays;

public class BubbleSorterMassiv {
    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};
// 3.11.14.7.16
        //3.11.7.14.16
        //3.7.11.14.16 - при данной последовательности в цикле for условие if не выполниться и значение перемменой isSorted
        //  не измениться на false, в таком случае мы не зайдем в цикл while  на следующей итерации
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
//        System.out.println(Arrays.toString(mas));


        bubbleSort();
    }

    public static void bubbleSort() {
        int[] mas = {11, 3, 14, 16, 7};
        int buf;
        for (int i = mas.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {//внутрении
                if (mas[j] > mas[j + 1]) {


                    buf = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));



    }

}




