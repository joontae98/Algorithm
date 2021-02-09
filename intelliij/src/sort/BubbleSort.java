package sort;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int swap;
        int data[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int n = 0; n < data.length; n++) {
            System.out.printf("Enter the number " + (n + 1) + ": ");
            data[n] = sc.nextInt();
        }
        System.out.println("Before sort: " + Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = swap;
                }
            }
        }// i 회전
        System.out.println("After sort: " + Arrays.toString(data));
        sc.close();
    }
}
