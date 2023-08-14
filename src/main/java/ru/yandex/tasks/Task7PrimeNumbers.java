package ru.yandex.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7PrimeNumbers {
    public static int[] findPrimes (int N) {
        /*
         * 2 <= N <= 10^6
         * Выход: отсортированный массив всех простых чисел от 2 до N
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        boolean[] checkArr = new boolean[N + 1];
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 2; i < N + 1; i++) {
            if (!checkArr[i]) {
                arrayList.add(i);
                int k = i + i;
                while (k < N + 1) {
                    checkArr[k] = true;
                    k += i;
                }
            }
        }

        return Arrays.stream(arrayList.toArray()).mapToInt(o -> (int)o).toArray();
    }

    public static void selfCheck() {
        int[] output = {2, 3, 5};

        assert (Arrays.equals(output, findPrimes(5)));
    }
}
