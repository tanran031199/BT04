package BT.BT09;

public class BaiTap09 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 12, 4, 5, 6, 7, 8};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Giá trị lớn thứ 2 của mảng là: " + max2);
    }
}
