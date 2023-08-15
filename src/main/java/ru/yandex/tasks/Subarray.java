package ru.yandex.tasks;

public class Subarray {
    /*
     * Подмассив (подряд идущие элементы массива) для 11 задачи (нумерация массива с нуля)
     * left  - левая граница, включается (0...10^5-1)
     * right - правая граница, не включается (0...10^5)
     */
    public int left;
    public int right;

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }
}
