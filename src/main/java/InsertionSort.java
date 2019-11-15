public class InsertionSort {

    public  void insertionSort(int[] array) {
        int j;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for ( j = i - 1; j >= 0 && array[j] > temp; j--) {
                array [j+1] = array [j];
            }
            array[j+1] = temp;
        }
    }


    public int interpolationSearch(int[] array, int value) {
        insertionSort(array);
  int  left = 0;
  int right = array.length - 1;

        while (left <= right && array[left] <= value && value <= array[right]) {
            if (left == right) {
                if (array[left] == value) return left;
                return -1;
            }
            int mid = left + ((right - left) *
                    (value - array[left]) )/ (array[right] - array[left]);

            if (array[mid] < value) {
                left = mid + 1;
            } else if (array[mid] > value) {
                right = mid - 1;
            } else
                return mid;
        }

        return -1;


    }

}
