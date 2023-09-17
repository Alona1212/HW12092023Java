//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//        Выведите его на консоль в строку.
//        Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

import java.util.Arrays;

public class HW1209_2 {
    public static void main(String[] args) {
        int[] array = new int [5];
        for (int i=0; i<array.length; i++){
            array [i] = (int)(Math.random()*89+10);
        }
        boolean check = true;
        for (int i=0; i<array.length; i++) {
            if (array[i] >= array[i + 1]) check = false;
        }
        System.out.println(check);
    }
}
