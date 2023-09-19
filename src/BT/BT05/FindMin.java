package BT.BT05;

public class FindMin {
    private int[] arr;
    FindMin(int[] inputArr) {
        arr = inputArr;
    }

    public int getMin() {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
        }

        return min;
    }
}
