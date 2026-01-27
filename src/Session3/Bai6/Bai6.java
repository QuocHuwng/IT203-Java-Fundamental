package Session3.Bai6;

import java.util.Arrays;

public class Bai6 {

    public static int[] mergeBooks(int[] a, int[] b) {
        int[] tempMerge = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                tempMerge[k++] = a[i++];
            } else if (a[i] > b[j]) {
                tempMerge[k++] = b[j++];
            } else {
                tempMerge[k++] = a[i++];
                j++;
            }
        }

        while (i < a.length) tempMerge[k++] = a[i++];
        while (j < b.length) tempMerge[k++] = b[j++];

        int[] arrayMerge = new int[k];
        for (int index = 0; index < k; index++) {
            arrayMerge[index] = tempMerge[index];
        }

        return arrayMerge;
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        int[] result = mergeBooks(arrayFirst, arraySecond);

        System.out.println("Kho cũ: " + Arrays.toString(arrayFirst));
        System.out.println("Lô mới: " + Arrays.toString(arraySecond));
        System.out.println("Kho tổng (đã gộp & lọc trùng): " + Arrays.toString(result));
    }
}