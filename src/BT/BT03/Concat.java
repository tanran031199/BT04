package BT.BT03;

public class Concat {
    private final int[] arr;
    private final int[] arr1;
    private final int[] arr2;
    Concat (int[] inputArr1, int[] inputArr2) {
        arr1 = inputArr1;
        arr2 = inputArr2;
        arr = new int[inputArr1.length + inputArr2.length];
    }

    public int[] getArr() {
        for (int i = 0; i < arr.length; i++) {
            if(i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i - arr1.length];
            }
        }

        return arr;
    }
}
