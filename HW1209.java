//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//        Выведите массив на консоль в строку.
//        Замените каждый элемент с нечетным индексом на ноль.
//        Снова выведете массив на консоль в отдельной строке.

import java.util.Arrays;

public class HW1209 {
    public static void main(String[] args) {
        int[] array = new int [8];
        for (int i=0; i<array.length; i++){
            array [i] = (int)(Math.random()*49+1);
        }
        System.out.println(Arrays.toString (array));
        for (int i=0; i<array.length; i+=2){
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}