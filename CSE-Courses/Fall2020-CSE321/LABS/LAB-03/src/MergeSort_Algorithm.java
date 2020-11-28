class MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;
    public void sort (int Arr[]) {
        this.array = Arr;
        this.length = Arr.length;
        this.tempMergeArr = new int[length];
        divide_array(0, length-1);
    }
    public void divide_array (int lowerIndex, int higherIndex) {
        if ( lowerIndex < higherIndex ) {
            int middle = lowerIndex + (higherIndex - lowerIndex)/2;
            // It will sort the left side
            divide_array(lowerIndex, middle);
            // It will sort the right side
            divide_array(middle + 1, higherIndex);

            mergeArray(lowerIndex, middle, higherIndex);

        }
    }
    public void mergeArray(int lowerIndex, int middle, int highrtIndex) {
        for (int i = lowerIndex ; i <= highrtIndex ; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle+1;
        int k = lowerIndex;

        while (i <= middle && j <= highrtIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }
            else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
    public void printArray(int[] Arr) {
        for (int i : Arr) {
            System.out.print(i + " ");
        }
    }
}

public class MergeSort_Algorithm {
    public static void main(String[] args) {

        int[] Arr = {48, 36, 94, 52, 13, 19, 21};
        MergeSort ms = new MergeSort();
        ms.sort(Arr);
        ms.printArray(Arr);
    }
}