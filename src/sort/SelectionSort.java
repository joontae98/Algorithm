package sort;

import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int k;
        int data[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int m = 0; m < data.length; m++) {
            System.out.printf("Enter the number " + (m + 1) + ": ");
            data[m] = sc.nextInt();
        }
        System.out.println("Before sort: "+Arrays.toString(data));

        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    k = data[i];
                    data[i] = data[j];
                    data[j] = k;
                }
            }
        }// i 회전
        System.out.println("After sort: "+Arrays.toString(data));
        sc.close();
    }
}
