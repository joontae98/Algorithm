package sort;

import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int key;
        int data[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int n = 0; n < data.length; n++) {
            System.out.printf("Enter the number " + (n + 1) + ": ");
            data[n] = sc.nextInt();
        }
        System.out.println("Before sort: " + Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            key = data[i + 1];
            for (int j = i; j > 0; j--) {
                if (data[j - 1] > key) {
                    data[j] = data[j - 1];
                } else {
                    data[j] = key;
                    break;
                }
            }
        }// i 회전
        System.out.println("After sort: " + Arrays.toString(data));
        sc.close();
    }
}
