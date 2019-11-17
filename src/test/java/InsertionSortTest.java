import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
private static InsertionSort testSort;
private final  int[] TEST_ARRAY = new int[] {1, 2, 3, 4, 5};

@BeforeAll
static void setup() {
    testSort = new InsertionSort();
}

    @Test
    void insertionSort() {
        int[] array = new int[] {1, 4, 5, 3, 2};
        testSort.insertionSort(array);
        assertArrayEquals(array, TEST_ARRAY);
    }

    @Test
   void interpolationSearch() {
    assertEquals(testSort.interpolationSearch(TEST_ARRAY, 4), 3);
    assertEquals(testSort.interpolationSearch(TEST_ARRAY, 7), -1);
    }

}