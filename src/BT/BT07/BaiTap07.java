package BT.BT07;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số hàng của mảng: ");
        int row = sc.nextInt();

        System.out.println("Nhập số cột của mảng: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for(int[] array : arr) {
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
        }

        System.out.println("Mảng của bạn là: " + Arrays.deepToString(arr));
        int sum = 0;
        int countCol = 0;

        for(int[] array : arr) {
            sum += array[countCol];
            countCol++;
        }

        System.out.println("Tổng các số ở đường chéo chính là: " + sum);
    }
}
