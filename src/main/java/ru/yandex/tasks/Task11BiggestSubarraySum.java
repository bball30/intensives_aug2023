package ru.yandex.tasks;

public class Task11BiggestSubarraySum {

    public static Subarray find(int[] numbers) {
        /*
         * Находит подмассив (подряд идущие элементы массива) с наибольшей суммой элементов
         * numbers: массив целых чисел, -10^5 <= numbers[i] <= 10^5, длина массива до 10^5
         * Выход: Subarray
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int[] sums = new int[numbers.length];
        sums[0] = Math.max(0, numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            sums[i] = Math.max(numbers[i - 1] + numbers[i], 0);
        }

        int l = 0;
        int sum = 0;
        int maxSum = 0;
        Subarray subarray = new Subarray();
        for (int i = 0; i < sums.length; i++) {
            l = i;
            while (i < numbers.length && sums[i] != 0 ) {
                sum += numbers[i];
                i++;
            }
            if (sum > maxSum) {
                subarray.setLeft(l);
                subarray.setRight(i);
            }
        }

        return subarray;
    }

    public static void selfCheck() {
        int[] output = {1, 2, -5, 7, -1, 6};
        Subarray ans = find(output);

        assert ans != null;
        assert (ans.left == 3 && ans.right == 6);
    }
}
