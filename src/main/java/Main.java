public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 4, 7, 0, 10, 5};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(array);
        
        System.out.println(insertionSort.interpolationSearch(array, 10));
    }
}
