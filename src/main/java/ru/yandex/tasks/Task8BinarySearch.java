package ru.yandex.tasks;

public class Task8BinarySearch {
    public static int find(int number, int[] sortedList) {
        /*
         * number: целое число, -10^5 <= number <= 10^5
         * numbers: массив целых чисел, 0 <= numbers.length <= 10^5 (числа не повторяются)
         * Выход: i, где numbers[i] = number, -1, если такого i нет
         * Если таких i несколько, вывести наибольший
         */
        // (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ WRITE CODE HERE (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧

        int l = 0;
        int r = sortedList.length;
        int res = -1;

        while (r >= l) {
            int mid = (l + r) / 2;
            if (sortedList[mid] == number && mid > res) {
                res = mid;
            }
            if (sortedList[mid] >= number) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    public static void selfCheck() {
        int[] input = {1, 3, 5, 7, 9};

        for (int i = 0; i < input.length; i++) {
            assert (find(input[i], input) == i);
        }
    }
}
